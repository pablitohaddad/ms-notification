package io.github.pablitohaddad.msnotification.entities;

import io.github.pablitohaddad.msnotification.enums.Events;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "notifications")
public class UserNotification {
    private ObjectId id;
    private String email;
    private Events event;
    private String date;
}
