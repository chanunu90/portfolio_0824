package org.astro.portfolio.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReplyDTO {
    
    private Long rno;
    private Long bno;
    private Long gno;
    // @Builder.Default
    // private boolean ord = false;
    private boolean delFlag;

    private String reply;
    private String nickname;
    
    // private Long mno;
    // private String email;
    // private String nickname;


}
