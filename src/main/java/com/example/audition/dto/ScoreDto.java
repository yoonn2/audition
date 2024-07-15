package com.example.audition.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ScoreDto {
    private int serial_no;
    private String artist_id;
    private String mento_id;
    private int point;
}
