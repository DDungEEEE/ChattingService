package chatting.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;

@RequiredArgsConstructor
public class StompChatController {

    private final SimpMessagingTemplate template;

//    @MessageMapping("/chat/enter")
}
