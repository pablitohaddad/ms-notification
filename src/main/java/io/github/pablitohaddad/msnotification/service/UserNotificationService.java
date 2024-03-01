package io.github.pablitohaddad.msnotification.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.pablitohaddad.msnotification.dto.mapper.UserNotificationMapper;
import io.github.pablitohaddad.msnotification.entities.UserNotification;
import io.github.pablitohaddad.msnotification.repository.UserNotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserNotificationService {

    private final UserNotificationRepository repository;

    public void messageTransform(String message) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            UserNotification userNotification = objectMapper.readValue(message, UserNotification.class);
            repository.save(userNotification);
            System.out.println(objectMapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(UserNotificationMapper.toDTO(userNotification)));
        }catch (JsonProcessingException e){
            throw new RuntimeException("Failed Json Processing");
        }
    }
}
