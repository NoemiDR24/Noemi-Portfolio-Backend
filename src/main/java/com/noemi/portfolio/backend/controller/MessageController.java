package com.noemi.portfolio.backend.controller;

import com.noemi.portfolio.backend.dto.MessageDto;
import com.noemi.portfolio.backend.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*") // Permitir acceso desde tu frontend React, http://localhost:8080/api/projects
public class MessageController {
    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping
    public List<MessageDto> getAll(){
        return service.getAllMessages();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.deleteMessage(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<MessageDto> create(@RequestBody MessageDto messageDto){
        return new ResponseEntity<>(service.createMessage(messageDto), HttpStatus.CREATED);
    }
}
