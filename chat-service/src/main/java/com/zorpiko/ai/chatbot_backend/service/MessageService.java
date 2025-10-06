package com.zorpiko.ai.chatbot_backend.service;

import com.zorpiko.ai.chatbot_backend.model.Message;
import com.zorpiko.ai.chatbot_backend.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message saveMessage(Message msg) {
        return repository.save(msg);
    }

    public List<Message> getAllMessages() {
        return repository.findAll();
    }
}