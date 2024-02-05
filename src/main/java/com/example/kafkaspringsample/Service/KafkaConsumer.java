package com.example.kafkaspringsample.Service;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
// KafkaListener annotation defines the topic and consumer group
@KafkaListener(topics = "SamplEventType",groupId = "group-one")
public class KafkaConsumer {

    @KafkaHandler //making it easy to organize and handle various message types in a clean and structured way
    public void consume(String message){
        System.out.println("Message received Successfully"+ message);
    }
}