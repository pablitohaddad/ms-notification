package io.github.pablitohaddad.msnotification.mqueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.pablitohaddad.msnotification.entities.UserNotification;
import io.github.pablitohaddad.msnotification.exceptions.MessageFailingException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @RabbitListener(queues = "${mq.queues.msnotification}")
    public void receiveMessage(String message){
        if (message.isBlank() || message.isEmpty()) {
            throw new MessageFailingException("Message Failing");
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            UserNotification userNotification = objectMapper.readValue(message, UserNotification.class);
            System.out.println(userNotification.getEmail() + " - " + userNotification.getEvent() + " - " + userNotification.getDate());
        }catch (JsonProcessingException ex){
            throw new RuntimeException("Unprocessing json");
        }


    }
}