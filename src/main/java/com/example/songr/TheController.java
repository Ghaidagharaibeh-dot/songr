package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller

public class TheController {



    @GetMapping("/hello")
    @ResponseBody
    public String hello(String name){

        return "Hello";
    }
    public String capitalizeWord(String words){
        return words.toUpperCase(Locale.ROOT);
    }
    @GetMapping("/album")
    public String albums(){
        List<Album> listForAlbums =new ArrayList<>();

        listForAlbums.add(new Album("Rammstein", "Rammstein", 2780, 11, "https://upload.wikimedia.org/wikipedia/en/1/16/Rammstein_-_Rammstein.png"));
        listForAlbums.add(new Album("Tamally Maak", "Amr Diab", 10, 1500,"https://img.discogs.com/mrVhxSpktswpKo82TcPqv0vK80U=/fit-in/300x300/filters:strip_icc():format(webp):mode_rgb():quality(40)/discogs-images/R-6944106-1500743368-8340.jpeg.jpg"));
         return "album";
    }
}
