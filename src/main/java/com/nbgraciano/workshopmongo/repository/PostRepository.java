package com.nbgraciano.workshopmongo.repository;

import com.nbgraciano.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
