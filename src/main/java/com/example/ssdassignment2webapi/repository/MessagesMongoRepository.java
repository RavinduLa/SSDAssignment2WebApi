package com.example.ssdassignment2webapi.repository;

import com.example.ssdassignment2webapi.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessagesMongoRepository extends MongoRepository<Message, String> {
    List<Message> findByUsername(String id);
}
