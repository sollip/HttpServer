package kr.or.connect.webServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RequestHandler {
    Logger logger = LoggerFactory.getLogger(RequestHandler.class);

    public Request handle(Socket socket){
        BufferedReader reader = null;
        Request request = new Request();
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            request.parseRequestLine(reader.readLine());

            String line = "";
            while(!"".equals(line = reader.readLine())){
                request.addHeader(line);
            }

            logger.info(request.toString());
        } catch (IOException e) {
            logger.error(e.getMessage() );
        }
        return request;
    }
}
