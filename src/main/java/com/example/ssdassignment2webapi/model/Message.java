package com.example.ssdassignment2webapi.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("messages")
public class Message {
    @MongoId
    private String id;
    private String content;
    private String username;

    public Message() {
    }

    public Message(String id, String content, String username) {
        this.id = id;
        this.content = content;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
