package com.belajar.kafka.home.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaSenderExample {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    KafkaSenderExample(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message, String topicName){
        log.info("Sending {} : {}", message, topicName);
        kafkaTemplate.send(topicName, message);
    }
}
