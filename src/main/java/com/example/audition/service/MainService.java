package com.example.audition.service;

import com.example.audition.dto.ArtistDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MainService {
    private List<ArtistDto> artists = new ArrayList<>();
    public List<ArtistDto> getAllArtists() {
        return artists;
    }

    public void registerArtist(ArtistDto artistDto) {
        artists.add(artistDto);
    }
}
