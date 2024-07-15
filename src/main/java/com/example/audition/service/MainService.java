package com.example.audition.service;

import com.example.audition.dao.MainDao;
import com.example.audition.dto.ArtistDto;
import com.example.audition.dto.MentorScoreDto;
import com.example.audition.dto.RankingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class MainService {

    private final MainDao mainDao;

    public void registerArtist(ArtistDto artistDto) {
        mainDao.registerArtist(artistDto);
    }

    public List<ArtistDto> getAllArtists() {
        return mainDao.getAllArtists();
    }

    public List<MentorScoreDto> getMentorScores() {
        return mainDao.getMentorScores();
    }

    public List<RankingDto> getRanking() {
        return mainDao.getRanking();
    }
}
