package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forum {
    private ArrayList<ForumUser> forumUser;

    public Forum() {
        forumUser = new ArrayList<ForumUser>();

        forumUser.add(new ForumUser(1, "Adam", 'M', LocalDate.of(1975, 10,28), 7));
        forumUser.add(new ForumUser(2, "Jan", 'M', LocalDate.of(1980, 11,22), 0));
        forumUser.add(new ForumUser(3, "Zofia", 'K', LocalDate.of(1983, 3,8), 1));
        forumUser.add(new ForumUser(4, "Agata", 'K', LocalDate.of(1955, 1,2), 7));
        forumUser.add(new ForumUser(5, "Piotr", 'M', LocalDate.of(1999, 4,28), 6));
        forumUser.add(new ForumUser(6, "Tadeusz", 'M', LocalDate.of(2000, 7,15), 2));
        forumUser.add(new ForumUser(7, "Jan", 'M', LocalDate.of(1984, 10,28), 0));
    }

    public ArrayList<ForumUser> getUserList() {
        return forumUser;
    }
}