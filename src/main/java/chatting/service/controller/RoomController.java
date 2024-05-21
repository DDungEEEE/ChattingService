package chatting.service.controller;

import chatting.service.dto.ChatRoomDto;
import chatting.service.reopository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/chat")
@Log4j2
public class RoomController {

    private final ChatRoomRepository repository;

    @GetMapping(value = "/rooms")
    public List<ChatRoomDto> rooms(){

        log.info("# Find All Chat Rooms");
        return repository.findAllRooms();
    }

    @PostMapping(value = "/rooms")
    public void create(@RequestParam String name){

        log.warn("# Create Chat Room" +name);
        repository.createChatRoom(name);
    }

    @GetMapping("/room")
    public ChatRoomDto getRoom(String roomId){
        log.info("# get Chat Room, roomId: " + roomId);
        return repository.fondRoomById(roomId);
    }
}
