package com.camilo.antonio.services;

import com.camilo.antonio.domain.Post;
import com.camilo.antonio.repository.PostRepository;
import com.camilo.antonio.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Post post = postRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
        return post;
    }

}
