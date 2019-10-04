package com.ajk.kafka.services.producer;

import com.ajk.kafka.dto.SimpleModel;
import com.google.gson.Gson;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageProducerService {

    private Gson gson;
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaMessageProducerService(Gson gson, KafkaTemplate<String, String> kafkaTemplate) {
        this.gson = gson;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void submitNewMessage(SimpleModel simpleModel) {

        kafkaTemplate.send("myTopic", gson.toJson(simpleModel));
    }

}
