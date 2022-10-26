package com.belajar.kafka.home.controller;

import com.belajar.kafka.home.service.KafkaSenderExample;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final KafkaSenderExample sender;

    @Autowired
    public HomeController(KafkaSenderExample sender) {
        this.sender = sender;
    }

    @PostMapping("/send")
    public RequestMessage getMemberById(@RequestBody RequestMessage request){
        sender.sendMessage("send:" + request.getMessage() , "topic-1");
        return request;
    }
}
