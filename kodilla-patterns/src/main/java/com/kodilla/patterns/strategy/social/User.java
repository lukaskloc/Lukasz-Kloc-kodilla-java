package com.kodilla.patterns.strategy.social;

public class User {
    private final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharing() {
        return socialPublisher.share();
    }

    public void setPublishingStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

}
