package com.example.audition.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ArtistDto {
    private String artist_id;
    private String artist_name;
    private String artist_birth;
    private String artist_gender;
    private String talent;
    private String agency;
}
