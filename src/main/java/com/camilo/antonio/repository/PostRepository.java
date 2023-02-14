package com.camilo.antonio.repository;

import com.camilo.antonio.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
