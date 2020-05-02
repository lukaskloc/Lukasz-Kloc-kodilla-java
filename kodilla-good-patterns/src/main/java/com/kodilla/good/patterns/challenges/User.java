package com.kodilla.good.patterns.challenges;

public class User {
    private String realName;
    private int userId;

    public User(String realName, int userId) {
        this.realName = realName;
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "realName='" + realName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
