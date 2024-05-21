package chatting.service.dto;

import jakarta.persistence.Access;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor(access =  AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChattingRequestDto {

    private Long senderId;
    private String content;
}
