package com.example.logproducer.controller;

import com.example.logproducer.LogMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logs")
public class LogController {

    @Autowired
    private StreamBridge streamBridge;

    @PostMapping("/send")
    public String sendLog(@RequestBody LogMessage logMessage){
        streamBridge.send("output",logMessage);
        return "Log sent to Kafka";
    }

}
