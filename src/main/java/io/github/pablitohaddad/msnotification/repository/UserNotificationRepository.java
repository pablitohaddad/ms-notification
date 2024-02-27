package io.github.pablitohaddad.msnotification.repository;


import io.github.pablitohaddad.msnotification.entities.UserNotification;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserNotificationRepository extends MongoRepository<UserNotification, ObjectId> {
}