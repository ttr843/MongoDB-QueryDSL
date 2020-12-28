package ru.itis.javalab.querydsl.controllers;

import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.javalab.querydsl.models.Post;
import ru.itis.javalab.querydsl.models.PostDto;
import ru.itis.javalab.querydsl.models.User;
import ru.itis.javalab.querydsl.repositories.PostsRepository;
import ru.itis.javalab.querydsl.repositories.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequiredArgsConstructor
public class PostController {
    @Autowired
    private PostsRepository postsRepository;
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/posts/search")
    public ResponseEntity<List<PostDto>> searchByPredicate(@QuerydslPredicate(root = Post.class)
                                                                       Predicate predicate) {
        return ResponseEntity.ok(
                StreamSupport.stream(postsRepository.findAll(predicate).spliterator(),true)
                .map(post -> PostDto.builder()
                                .description(post.getDescription())
                                .title(post.getTitle())
                                .userFirstName(usersRepository.findById(post.getUser()).map(User::getFirstname)
                                        .orElse(null))
                                .userLastName(usersRepository.findById(post.getUser()).map(User::getLastname)
                                        .orElse(null))
                                .build()).collect(Collectors.toList()));
    }

}
