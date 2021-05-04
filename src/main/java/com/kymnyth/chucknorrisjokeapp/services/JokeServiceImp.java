package com.kymnyth.chucknorrisjokeapp.services;

import com.kymnyth.chucknorrisjokeapp.models.Joke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImp implements JokeService {
        private final ChuckNorrisQuotes chuckNorrisQuotes;
        private final Joke joke;
  
    @Autowired
    public JokeServiceImp(Joke joke) {
        this.joke = joke;
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public Joke getJoke(){
        joke.setJoke(chuckNorrisQuotes.getRandomQuote());
        return joke;
    }

}
