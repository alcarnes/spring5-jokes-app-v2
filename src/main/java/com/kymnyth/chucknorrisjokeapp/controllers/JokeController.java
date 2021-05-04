package com.kymnyth.chucknorrisjokeapp.controllers;

import com.kymnyth.chucknorrisjokeapp.services.JokeService;
import com.kymnyth.chucknorrisjokeapp.services.JokeServiceImp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JokeController {

    private final JokeService jokeService;

    

public JokeController(JokeServiceImp jokeService) {
        this.jokeService = jokeService;
    }



@RequestMapping(path="/")
public String getJoke(Model model){
    model.addAttribute("joke", jokeService.getJoke());
    return "index";
}
    
}
