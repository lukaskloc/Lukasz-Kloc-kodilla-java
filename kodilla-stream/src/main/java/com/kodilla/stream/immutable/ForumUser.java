package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser(String username, String realname) {
        this.username = username;
        this.realName = realname;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
