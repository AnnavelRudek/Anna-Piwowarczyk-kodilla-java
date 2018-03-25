package com.kodilla.testing.forum.statistics;

import java.util.List;

 interface Statistics {
    List<String> userNames(); // -> user names list
    int postCount(); //total amount
    int commentCount(); // total amount of forum comments

}
