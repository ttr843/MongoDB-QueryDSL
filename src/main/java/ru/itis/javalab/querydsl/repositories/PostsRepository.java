package ru.itis.javalab.querydsl.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.itis.javalab.querydsl.models.Post;

public interface PostsRepository extends MongoRepository<Post, ObjectId>, QuerydslPredicateExecutor<Post> {

}
