package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public  Forum(){

        userList.add(new ForumUser(1, "stefan", 'm', LocalDate.of(1991, 8, 8), 156));
        userList.add(new ForumUser(2, "kasiek", 'f', LocalDate.of(1981, 3, 5), 55));
        userList.add(new ForumUser(3, "antonina", 'f', LocalDate.of(1990, 1, 30), 120));
        userList.add(new ForumUser(4, "klemens", 'm', LocalDate.of(1985, 10, 25), 654));
        userList.add(new ForumUser(5, "raczek", 'm', LocalDate.of(1977, 3, 31), 99));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
