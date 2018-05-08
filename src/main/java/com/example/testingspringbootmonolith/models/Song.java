package com.example.testingspringbootmonolith.models;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "SONGS")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "LENGTH")
    private String length;

    @Column(name = "ARTIST")
    private String artist;


}