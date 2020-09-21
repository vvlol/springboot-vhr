package cn.hzw.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServer;

@SpringBootApplication
public class WebService {
    public static void main(String[] args) {
        SpringApplication.run(WebServer.class,args);
    }
}
