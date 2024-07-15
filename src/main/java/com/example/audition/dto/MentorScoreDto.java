package com.example.audition.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MentorScoreDto {
    private int serial_no;
    private String artist_id;
    private String artist_name;
    private String artist_birth;
    private int point;
    private String mento_name;

}
