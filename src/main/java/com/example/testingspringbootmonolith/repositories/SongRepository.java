package com.example.testingspringbootmonolith.repositories;

import com.example.testingspringbootmonolith.models.Song;
import com.example.testingspringbootmonolith.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {

}
