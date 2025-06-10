package com.noemi.portfolio.backend.service;

import com.noemi.portfolio.backend.dto.MessageDto;
import com.noemi.portfolio.backend.model.Message;
import com.noemi.portfolio.backend.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<MessageDto> getAllMessages() {
        List<Message> messages = messageRepository.findAll();
        return  messages.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MessageDto createMessage(MessageDto messageDto){
        Message message = convertToEntity(messageDto);
        Message savedMessage = messageRepository.save(message);
        return convertToDto(savedMessage);
    }

    @Override
    public void deleteMessage(Integer id) {
        messageRepository.deleteById(id);
    }

    private MessageDto convertToDto(Message message) {
        MessageDto messageDto = new MessageDto();
        messageDto.setId(message.getId());
        messageDto.setName(message.getName());
        messageDto.setEmail(message.getEmail());
        messageDto.setMessage(message.getMessage());
        return messageDto;
    }

    private Message convertToEntity(MessageDto messageDto){
        Message message = new Message();
        message.setId(messageDto.getId());
        message.setName(messageDto.getName());
        message.setEmail(messageDto.getEmail());
        message.setMessage(messageDto.getMessage());
        return message;
    }
}
