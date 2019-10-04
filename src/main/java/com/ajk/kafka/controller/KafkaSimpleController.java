package com.ajk.kafka.controller;

import com.ajk.kafka.dto.SimpleModel;
import com.ajk.kafka.services.producer.KafkaMessageProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaSimpleController {

    private KafkaMessageProducerService kafkaMessageProducerService;

    public KafkaSimpleController(KafkaMessageProducerService kafkaMessageProducerService) {
        this.kafkaMessageProducerService = kafkaMessageProducerService;
    }

    @PostMapping
    public void post(@RequestBody SimpleModel simpleModel) {
        kafkaMessageProducerService.submitNewMessage(simpleModel);
    }

}
