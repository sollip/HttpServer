package kr.or.connect.webServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpServer {
    Logger logger = LoggerFactory.getLogger(HttpServer.class);
    int portNumber = 8080;

    public void run() {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        try {
            serverSocket = new ServerSocket(portNumber);
            logger.info("SERVER START");
            while(true){
                clientSocket = serverSocket.accept();
                logger.info("CLINET CONNECT");
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.run();
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }finally {
        }
    }

}
