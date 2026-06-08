package com.nbgraciano.workshopmongo.services;

import com.nbgraciano.workshopmongo.domain.Post;

import com.nbgraciano.workshopmongo.repository.PostRepository;
import com.nbgraciano.workshopmongo.services.exception.ObjNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj=repo.findById(id);
        return obj.orElseThrow(()->new ObjNotFoundException("Post not found"));
    }


}
