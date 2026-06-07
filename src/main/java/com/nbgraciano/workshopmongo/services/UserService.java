package com.nbgraciano.workshopmongo.services;

import com.nbgraciano.workshopmongo.domain.User;
import com.nbgraciano.workshopmongo.dto.UserDTO;
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
    public User insert(User obj){
        return repo.insert(obj);
    }
    public void delete(String id){
        User obj=repo.findById(id).orElseThrow(()-> new ObjNotFoundException("User not found"));
        repo.delete(obj);
     }
    public User fromDto(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
