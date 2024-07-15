package com.example.audition.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RankingDto {
    private String artist_id;
    private String artist_name;
    private String artist_gender;
    private int total_score;
    private double average_score;
    private int rank;
}
