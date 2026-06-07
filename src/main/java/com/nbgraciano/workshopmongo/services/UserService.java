package com.nbgraciano.workshopmongo.services;

import com.mongodb.client.MongoClient;
import com.nbgraciano.workshopmongo.domain.User;
import com.nbgraciano.workshopmongo.repository.UserRepository;
import com.nbgraciano.workshopmongo.services.exception.ObjNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> findAll() {
      return repo.findAll();
    }
    public User findById(String id){
        Optional<User>obj=repo.findById(id);
        return obj.orElseThrow(()->new ObjNotFoundException("User not found"));
    }
}
