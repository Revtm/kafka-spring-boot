package com.belajar.kafka.home.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListenerExample {

    @KafkaListener(topics = "topic-1", groupId = "myGroup")
    void listener(String data){
      log.info("listen : {}", data);
    }

}
