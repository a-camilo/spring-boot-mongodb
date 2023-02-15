package com.camilo.antonio.repository;

import com.camilo.antonio.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{'title':{$regex: ?0, $options: 'i'}}")
    List<Post> searchByTitle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text);
}
