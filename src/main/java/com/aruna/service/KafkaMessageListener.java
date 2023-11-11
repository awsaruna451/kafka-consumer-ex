package com.aruna.service;

import com.aruna.constant.ConfigConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaMessageListener {

    @KafkaListener(topics = ConfigConstant.kafkaTopic,groupId = "aruna-group")
    public void consumeEvents(String message) {
        log.info("consumer1 consume the events {} ", message);
    }
    /*@KafkaListener(topics = ConfigConstant.kafkaTopic,groupId = "aruna-group")
    public void consumeEvents2(String message) {
        log.info("consumer2 consume the events {} ", message);
    }*/
}
