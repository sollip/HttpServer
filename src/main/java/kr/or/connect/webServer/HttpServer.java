package kr.or.connect.webServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class HttpServer {
    Logger logger;
    int portNumber = 8080;

    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
