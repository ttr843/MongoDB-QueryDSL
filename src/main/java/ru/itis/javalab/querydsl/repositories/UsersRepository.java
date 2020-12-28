package ru.itis.javalab.querydsl.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import ru.itis.javalab.querydsl.models.User;

public interface UsersRepository  extends MongoRepository<User, ObjectId> {
}
