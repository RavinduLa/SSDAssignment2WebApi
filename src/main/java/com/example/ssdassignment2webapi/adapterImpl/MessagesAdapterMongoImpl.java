package com.example.ssdassignment2webapi.adapterImpl;

import com.example.ssdassignment2webapi.adapter.MessagesAdapter;
import com.example.ssdassignment2webapi.model.Message;
import com.example.ssdassignment2webapi.repository.MessagesMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessagesAdapterMongoImpl implements MessagesAdapter {

    private final MessagesMongoRepository messagesMongoRepository;

    //constructor
    //get the autowired repository
    @Autowired
    public MessagesAdapterMongoImpl(MessagesMongoRepository messagesMongoRepository) {
        this.messagesMongoRepository = messagesMongoRepository;
    }


    @Override
    public Message save(Message message) {
        return messagesMongoRepository.save(message);
    }

    @Override
    public List<Message> getAll() {
        return messagesMongoRepository.findAll();
    }

    @Override
    public Message update(Message message) {
        return null;
    }

    @Override
    public String delete(String id) {
        messagesMongoRepository.deleteById(id);
        return id;
    }

    @Override
    public Message getById(String id) {
        if (messagesMongoRepository.findById(id).isPresent()){
            return messagesMongoRepository.findById(id).get();
        }
        else
            return null;
    }

    @Override
    public List<Message> getByUsername(String username) {
        return messagesMongoRepository.findByUsername(username);
    }

    @Override
    public String updateContent(String id, String newContent) {
        return null;
    }

}
