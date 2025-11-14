package com.example.springboot_demo.controller;

import com.example.springboot_demo.publisher.KafkaProducer;
import com.example.springboot_demo.publisher.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class TopicController {

    @Autowired
    private KafkaProducer producer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        producer.sendMessage(message);
        return "Message sent to Kafka topic: " + message;
    }

}
