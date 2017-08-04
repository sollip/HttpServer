package kr.or.connect.webServer;

import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Request {

    private final String httpVersion = "HTTP/1.1";
    private Map<String,String> headers =new HashMap<String, String>();

    private InputStream bodyInput;
    private String method;
    private String requestTarget;
    private InputStream inputStream;

    public Request(){

    }
    public void parseRequestLine(String line){ // method랑 requestTarget 초기화
        StringTokenizer token = new StringTokenizer(line," ");
        setMethod(token.nextToken());
        setRequestTarget(token.nextToken());
    }
    public void addHeader(String line){
        int index = line.indexOf(":");

        headers.put(line.substring(0,index).trim(),line.substring(index+1,line.length()).trim());
    }
    public String getHeader(String key){
        return headers.get(key);
    }

    public InputStream getBodyInput() {
        return bodyInput;
    }

    public void setBodyInput(InputStream bodyInput) {
        this.bodyInput = bodyInput;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRequestTarget() {
        return requestTarget;
    }

    public void setRequestTarget(String requestTarget) {
        this.requestTarget = requestTarget;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public String toString() {
        return "Request [" +
                "httpVersion='" + httpVersion + '\'' +
                ", headers=" + headers +
                ", method='" + method + '\'' +
                ", requestTarget='" + requestTarget + '\'' +
                ", bodyInput=" + bodyInput +
                ']';
    }

    public String toString(Collection<?> collection, int i){
        return null;
    }


}

