package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> userNames(); // llist of users names
    int postCount(); // liczba postow
    int commentCount(); // liczba komentow
}
