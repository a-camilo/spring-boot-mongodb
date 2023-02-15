package com.camilo.antonio.services;

import com.camilo.antonio.domain.Post;
import com.camilo.antonio.repository.PostRepository;
import com.camilo.antonio.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Post post = repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
        return post;
    }

    public List<Post> findByTitle(String text){
        return repository.searchByTitle(text);
    }

}
