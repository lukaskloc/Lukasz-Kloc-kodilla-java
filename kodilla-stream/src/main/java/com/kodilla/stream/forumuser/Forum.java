package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser("101", "username1", 'F', 1979, 04, 20, 789));
        usersList.add(new ForumUser("102", "username2", 'M', 1989, 04, 20, 100));
        usersList.add(new ForumUser("103", "username3", 'F', 1999, 04, 20, 0));
        usersList.add(new ForumUser("104", "username4", 'M', 2009, 04, 20, 10));
        usersList.add(new ForumUser("105", "username5", 'M', 1984, 04, 20, 77));
        usersList.add(new ForumUser("106", "username6", 'M', 1994, 04, 20, 1020));
        usersList.add(new ForumUser("107", "username7", 'F', 2004, 04, 20, 4));
        usersList.add(new ForumUser("108", "username8", 'M', 2001, 04, 20, 0));
        usersList.add(new ForumUser("109", "username9", 'M', 2002, 04, 20, 20));
        usersList.add(new ForumUser("110", "username10", 'M', 2003, 04, 20, 444));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(usersList);
    }
}
