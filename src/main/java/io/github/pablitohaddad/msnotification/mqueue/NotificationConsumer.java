package io.github.pablitohaddad.msnotification.mqueue;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.pablitohaddad.msnotification.entities.UserNotification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @RabbitListener(queues = "${mq.queues.msnotification}")
    public void receiveMessage(String message) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            UserNotification userNotification = objectMapper.readValue(message, UserNotification.class);
            System.out.println("Mensagem recebida: " + userNotification.getEmail() + " - " + userNotification.getEvent() + " - " + userNotification.getDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
