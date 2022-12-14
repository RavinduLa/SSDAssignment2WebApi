package com.example.ssdassignment2webapi.adapter;

import com.example.ssdassignment2webapi.model.Message;

import java.util.List;

public interface MessagesAdapter {

    Message save(Message message);
    List<Message> getAll();
    Message update(Message message);
    String delete (String id);
    Message getById (String id);
    List<Message> getByUsername (String username);
    String updateContent(String id, String newContent);


}
