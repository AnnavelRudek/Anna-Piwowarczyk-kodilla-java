package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    String username;

    private ForumUser() {
        username = "Stefan Poziomka";
    }
}
