package com.example.consumer2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "sf")
    public void reader(String message) {
        System.out.println(message);
    }
}
