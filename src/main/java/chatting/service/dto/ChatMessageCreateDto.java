package chatting.service.dto;

import lombok.Data;

@Data
public class ChatMessageCreateDto {

    private long roomId;
    private String loginId;
    private String message;
}
