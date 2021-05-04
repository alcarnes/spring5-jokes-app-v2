package com.kymnyth.chucknorrisjokeapp.models;

import org.springframework.stereotype.Component;

@Component
public class Joke {

    private String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
    
}
