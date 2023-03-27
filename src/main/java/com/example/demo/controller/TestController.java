package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${cloud.aws.credentials.access-key}")
    String accessKey;

    @Value("${cloud.aws.credentials.secret-key}")
    String secretKey;

    @GetMapping("/test")
    String testKeys() {
        System.out.println(accessKey);
        System.out.println(secretKey);

        return accessKey + "---------" + secretKey;
    }
}
