package com.example.testingspringbootmonolith.controllers;


import com.example.testingspringbootmonolith.models.Song;

import com.example.testingspringbootmonolith.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SongsController{

    @Autowired
    private SongRepository songRepository;

    @GetMapping("/songs")
    public Iterable<Song> getAllSongs(){
        return songRepository.findAll();
    }


    @GetMapping("/songs/{songId}")
    public Optional<Song> findSongById(@PathVariable Long songId) {
        return songRepository.findById(songId);
    }

    @PostMapping("/songs")
    public Song createNewSong(@RequestBody Song newSong) {
        return songRepository.save(newSong);
    }


    @PatchMapping("/songs/{songId}")
    public Song updateSongById(@PathVariable Long songId, @RequestBody Song songRequest) {

        Song songFromDb = songRepository.findById(songId).get();
        songFromDb.setTitle(songRequest.getTitle());

        songFromDb.setLength(songRequest.getLength());
        songFromDb.setArtist(songRequest.getArtist());

        return songRepository.save(songFromDb);
    }

}
