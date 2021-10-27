package com.example.songr.controller;


import com.example.songr.modal.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

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

    @GetMapping("/capitalize/{words}")
    public String capitalizeWord(@PathVariable String words,Model model ){
        String uppercaseWord=words.toUpperCase();
        model.addAttribute("words",uppercaseWord);
        return "capitalize";




    }

    @GetMapping("/")
    public String getRoot(){
        return "Root";

    }

    // Lab 11
//    @GetMapping("/album")
//    public String albums( Model model ){
//        List<Album> albumList =new ArrayList<>();
//        albumList.add(new Album("Forklor", "Taylor Swift", 44, 6,"https://upload.wikimedia.org/wikipedia/en/f/f2/Taylor_Swift_-_Reputation.png"));
//        albumList.add(new Album("iTunes Live from SoHo", "Adele", 280, 5, "https://upload.wikimedia.org/wikipedia/ru/f/f6/Adele_-_ITunes_Live_from_SoHo.jpeg"));
//        albumList.add(new Album("Tamally Maak", "Amr Diab", 10, 1500,"https://cdn.al-ain.com/lg/images/2020/10/06/127-234238-amr-diab-beauties_700x400.jpg"));
//        model.addAttribute("albums",albumList);
//
//        return "Album";
//    }






}
