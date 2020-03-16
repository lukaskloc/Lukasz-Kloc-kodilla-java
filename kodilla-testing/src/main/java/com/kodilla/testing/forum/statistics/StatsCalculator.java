package com.kodilla.testing.forum.statistics;

public class StatsCalculator {
    private double usersQuantity;
    private double postsQuantity;
    private double commentsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.userNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(usersQuantity > 0) {
            averagePostsPerUser = postsQuantity / usersQuantity;
            averageCommentsPerUser = commentsQuantity / usersQuantity;
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        }
        if(postsQuantity > 0) {
            averageCommentsPerPosts = commentsQuantity / postsQuantity;
        } else {
            averageCommentsPerPosts = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + usersQuantity);
        System.out.println("Number of posts: " + postsQuantity);
        System.out.println("Number of comments: " + commentsQuantity);
        System.out.println("Average of posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPosts);
    }

    public double getUsersQuantity() {
        return usersQuantity;
    }

    public double getPostsQuantity() {
        return postsQuantity;
    }

    public double getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }
}
