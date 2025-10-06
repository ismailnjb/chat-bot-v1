package com.zorpiko.ai.chatbot_backend.repository;

import com.zorpiko.ai.chatbot_backend.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
