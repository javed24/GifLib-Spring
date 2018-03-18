package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping(value = "/")
    @ResponseBody
    public String listGifs(){
        return "list of all the gifs in the world";
    }
    @RequestMapping(value = "/gif")
    @ResponseBody
    public String showGif(){
        return "here's the gif you clicked on!";
    }
    @RequestMapping(value = "/about")
    @ResponseBody
    public String about(){
        return "here's the about page for the app";
    }
}
