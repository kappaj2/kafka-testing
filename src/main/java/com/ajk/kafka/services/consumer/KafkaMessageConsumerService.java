package com.ajk.kafka.services.consumer;

import com.ajk.kafka.dto.SimpleModel;
import com.google.gson.Gson;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumerService {

    private Gson gson;

    public KafkaMessageConsumerService(Gson gson) {
        this.gson = gson;
    }

    /**
     * Consumes message on the specific topic.
     *
     * @param receivedMessage
     */
    @KafkaListener(topics = "myTopic")
    public void listenForKafkaMessages(String receivedMessage) {

        SimpleModel simpleModel = gson.fromJson(receivedMessage, SimpleModel.class);

        System.out.println(simpleModel.toString());

    }
}
