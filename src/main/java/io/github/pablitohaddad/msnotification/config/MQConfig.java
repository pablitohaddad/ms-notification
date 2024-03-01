package io.github.pablitohaddad.msnotification.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.pablitohaddad.msnotification.exceptions.MessageFailingException;
import io.github.pablitohaddad.msnotification.service.UserNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MQConfig {
    private final UserNotificationService userNotificationService;
    @RabbitListener(queues = "${mq.queues.msnotification}")
    public void receiveMessage(String message) {
        if (message.isEmpty() || message.isBlank())
            throw new MessageFailingException("Fail Message");
        userNotificationService.messageTransform(message);
    }
}
