package com.noemi.portfolio.backend.service;

import com.noemi.portfolio.backend.dto.MessageDto;

import java.util.List;

public interface MessageService {
    List<MessageDto> getAllMessages();
    MessageDto createMessage(MessageDto messageDto);
    void deleteMessage(Integer id);
}
