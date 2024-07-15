package com.example.audition.controller;

import com.example.audition.dto.ArtistDto;
import com.example.audition.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    public List<ArtistDto> getAllArtists() {
        return mainService.getAllArtists();
    }


    @PostMapping("/regist")
    public String registerArtist(@RequestBody ArtistDto artistDto) {
        mainService.registerArtist(artistDto);
        return "index";
    }
}
