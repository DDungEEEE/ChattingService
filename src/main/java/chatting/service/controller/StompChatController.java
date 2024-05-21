package chatting.service.controller;

import chatting.service.dto.ChatMessageCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class StompChatController {

    private final SimpMessagingTemplate template;

    @MessageMapping( "/chat/enter")
    public void enter(ChatMessageCreateDto message){
        message.setMessage(message.getLoginId() + "님이 입장하셨습니다.");
        template.convertAndSend("/sub/chat/room/" + message.getRoomId(), message);
    }

    @MessageMapping("/chat/message")
    public void message(ChatMessageCreateDto message){
        template.convertAndSend("/sub/chat/room/" + message.getRoomId(), message);
    }
}
