package io.github.pablitohaddad.msnotification.dto.mapper;

import io.github.pablitohaddad.msnotification.dto.UserNotificationDTO;
import io.github.pablitohaddad.msnotification.entities.UserNotification;
import org.modelmapper.ModelMapper;


public class UserNotificationMapper{

    public static UserNotificationDTO toDTO(UserNotification user){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(user, UserNotificationDTO.class);
    }
}
