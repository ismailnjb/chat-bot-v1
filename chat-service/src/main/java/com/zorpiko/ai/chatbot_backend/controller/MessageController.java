package com.zorpiko.ai.chatbot_backend.controller;

import com.zorpiko.ai.chatbot_backend.model.Message;
import com.zorpiko.ai.chatbot_backend.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping
    public List<Message> getMessages() {
        return service.getAllMessages();
    }

    @PostMapping
    public Message sendMessage(@RequestBody Message msg) {
        // Here you can call Azure AI API to generate bot reply
        return service.saveMessage(msg);
    }
}