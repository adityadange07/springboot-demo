package com.example.springboot_demo.publisher;

import com.example.springboot_demo.config.KafkaTopicConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    public KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send(KafkaTopicConfig.TOPIC_NAME,message);
        System.out.println("Sent message to kafka: " + message);
    }

}
