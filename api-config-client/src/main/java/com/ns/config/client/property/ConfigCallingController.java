package com.ns.config.client.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class ConfigCallingController {

    @Value("${message: Default Microservice Property}")
    private String message;

    @GetMapping("/test")
    public String message() {
        return message;
    }
    
//  For refresh config we need to call given url
//  URI:http://localhost:8089/actuator/refresh
//  Method: POST
//  Contect: Any
}