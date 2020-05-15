package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User dzesika = new Millenials("Dżesika Johnson");
        User brajan = new YGeneration("Brajan Brandon");
        User andzela = new ZGeneration("Andżelika Jelly");

        //When
        String dzesikaStrategyToShare = dzesika.sharing();
        System.out.println("Dżesika: " + dzesikaStrategyToShare);
        String brajanStrategyToShare = brajan.sharing();
        System.out.println("Brajan: " + brajanStrategyToShare);
        String andzelaStrategyToShare = andzela.sharing();
        System.out.println("Andżela: " + andzelaStrategyToShare);

        //Then
        Assert.assertEquals("[Social publisher] Using Facebook to publish", dzesikaStrategyToShare);
        Assert.assertEquals("[Social publisher] Using Twitter to publish", brajanStrategyToShare);
        Assert.assertEquals("[Social publisher] Using Snapchat to publish", andzelaStrategyToShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User dzesika = new Millenials("Dżesika Johnson");

        //When
        String dzesikaStrategyToShare = dzesika.sharing();
        System.out.println("Dżesika: " + dzesikaStrategyToShare);
        dzesika.setPublishingStrategy(new SnapchatPublisher());
        dzesikaStrategyToShare = dzesika.sharing();
        System.out.println("Dżesika from now on: " + dzesikaStrategyToShare);

        //Then
        Assert.assertEquals("[Social publisher] Using Snapchat to publish", dzesikaStrategyToShare);
    }
}
