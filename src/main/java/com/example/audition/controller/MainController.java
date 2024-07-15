package com.example.audition.controller;

import com.example.audition.dto.ArtistDto;
import com.example.audition.dto.MentoDto;
import com.example.audition.dto.MentorScoreDto;
import com.example.audition.dto.RankingDto;
import com.example.audition.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MainService mainService;

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/register")
    public String getAllArtists() {
         mainService.getAllArtists();
         return "register";
    }
    @PostMapping("/regist")
    public String registerArtist(ArtistDto artistDto) {
        mainService.registerArtist(artistDto);
        return "index";
    }
    @GetMapping("/list")
    public String showArtistList(Model model) {
        List<ArtistDto> artists = mainService.getAllArtists();
        model.addAttribute("artists", artists);
        return "list";
    }

    @GetMapping("/score")
    public String getMentorScores(Model model) {
        List<MentorScoreDto> mentorScores = mainService.getMentorScores();
        model.addAttribute("mentorScores", mentorScores);
        return "score";
    }

    @GetMapping("/ranking")
    public String getRanking(Model model) {
        List<RankingDto> rankings = mainService.getRanking();
        model.addAttribute("rankings", rankings);
        return "ranking";
    }
}
