package com.twitterstream.stream.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/twitter")
public class TwitterController {

    @Autowired
    private TwitterTemplate twitterTemplate;

    @GetMapping("/search")
    public String search() {
        twitterTemplate.streamingOperations().filter("test",)
        return "";
    }
}
