package kr.or.connect.webServer;

import java.net.Socket;

public class ClientThread extends Thread {
    private Socket clientSocket;
    private RequestHandler requestHandler;
    public ClientThread(Socket clientSocket){
        requestHandler = new RequestHandler();
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        requestHandler.handle(clientSocket);
    }
}
