package kr.or.connect.webServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(RequestHandler.class);
        logger.info("[Server Start]");
        HttpServer httpServer = new HttpServer();
        httpServer.run();
    }
}
