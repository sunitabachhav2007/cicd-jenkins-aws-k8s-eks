package com.sbachhav.sbachhavk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sbachhavDockerDemoController {

    @GetMapping("/hello1")
    public String hello() {
        return "I want to Print this message: Hello World ! Updated This file";
    }
}
