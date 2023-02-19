package com.nelioalves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nelioalves.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
