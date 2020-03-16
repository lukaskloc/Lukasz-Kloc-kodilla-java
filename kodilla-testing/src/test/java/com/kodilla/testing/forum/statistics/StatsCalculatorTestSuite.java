package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatsCalculatorTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite: begin.");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite: end.");
    }
    @Before
    public void before() {
        System.out.println("Test case: begin.");
    }
    @After
    public void after() {
        System.out.println("Test case: end.");
    }

    // 100 users, comments < posts, 1000 posts, 0 comments
    @Test
    public void testStatistics1() {
        //Given
        System.out.println("Testing: 100 users, more posts than comments, 1000 posts, 0 comments.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) { userNames.add("Name" + i); }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(1000, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(0, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(10, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(0, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }
    // 0 users, comments > posts, 100 posts, 1000 comments
    @Test
    public void testStatistics2() {
        //Given
        System.out.println("Testing 0 users, more comments than posts, 100 posts, 1000 comments.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(100, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(1000, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(0, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(10, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }
    // 200 users, 0 comments, 500 posts
    @Test
    public void testStatistics3() {
        //Given
        System.out.println("Testing 200 users, 500 posts, 0 comments.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 200; i++) { userNames.add("name" + i); }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(0, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(500, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(2.5, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(0, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }




}
