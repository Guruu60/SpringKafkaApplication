package com.example.kafkaspringsample.Controller;

import com.example.kafkaspringsample.Service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/sendmessage")
    public ResponseEntity<String> messageSend(@RequestBody String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message send to Kafka:" + message);
    }

    @GetMapping("/messageconsume")
    public ResponseEntity<String> messageRecieve(){
        // Implement logic to trigger message consumption
        return ResponseEntity.ok("Successfully consumed message from Topic.");
    }

}
