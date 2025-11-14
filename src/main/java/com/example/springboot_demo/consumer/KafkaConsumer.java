package com.example.springboot_demo.consumer;

import com.example.springboot_demo.config.KafkaTopicConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = KafkaTopicConfig.TOPIC_NAME, groupId = "demo-group")
    public void consumeMessage(String message) {
        System.out.println("Recieved message from Kafka: " + message);
    }

}
