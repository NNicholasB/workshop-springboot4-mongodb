package com.nbgraciano.workshopmongo.services;

import com.mongodb.client.MongoClient;
import com.nbgraciano.workshopmongo.domain.User;
import com.nbgraciano.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> findAll() {
        return repo.findAll();
    }
}
