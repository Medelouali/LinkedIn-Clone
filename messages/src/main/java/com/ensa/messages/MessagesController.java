package com.ensa.messages;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/messages")
@AllArgsConstructor
public class MessagesController {
    private final MessagesService messagesService;

    @RequestMapping(path = "", method = RequestMethod.GET)
    List<Message> getMessages() {
        return messagesService.getMessages();
    }
}