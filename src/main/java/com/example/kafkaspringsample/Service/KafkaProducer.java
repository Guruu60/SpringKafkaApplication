package com.example.kafkaspringsample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    //KafkaTemplate simplifies the process of sending messages to a Kafka topic,
    //eliminating boilerplate code and providing a straightforward approach. It also supports the use of key-value pairs

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public  void sendMessage(String message){
        //SamplEventType in send is name of the event type by this where each message within that topic represents a specific event
        kafkaTemplate.send("SamplEventType",message);
    }
}
