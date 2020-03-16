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

    // 100 users
    @Test
    public void testStatistics1() {
        //Given
        System.out.println("Testing: 100 users.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) { userNames.add("Name" + i); }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(1000, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(10, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(10, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0.1, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(0.01, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }
    // 0 users
    @Test
    public void testStatistics2() {
        //Given
        System.out.println("Testing 0 users.");
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
    // comments > posts
    @Test
    public void testStatistics3() {
        //Given
        System.out.println("Testing more comments than posts.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 200; i++) { userNames.add("name" + i); }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(1000, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(500, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(2.5, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(5, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(2, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }
    // comments < posts
    @Test
    public void testStatistics4() {
        //Given
        System.out.println("Testing more posts than comments.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 200; i++) { userNames.add("name" + i); }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(5000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(1000, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(5000, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(25, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(5, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(0.2, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }
    // 0 comments
    @Test
    public void testStatistics5() {
        //Given
        System.out.println("Testing 0 comments.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 200; i++) { userNames.add("name" + i); }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(5000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(0, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(5000, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(25, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(0, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }
    // 1000 posts
    @Test
    public void testStatistics6() {
        //Given
        System.out.println("Testing 1000 posts.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 200; i++) { userNames.add("name" + i); }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(500, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(100, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(0.5, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(2.5, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(5, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }
    // 0 posts
    @Test
    public void testStatistics7() {
        //Given
        System.out.println("Testing 0 posts.");
        StatsCalculator statsCalculator = new StatsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 200; i++) { userNames.add("name" + i); }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        statsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200, statsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(500, statsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(0, statsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(0, statsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(2.5, statsCalculator.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(0, statsCalculator.getAverageCommentsPerPosts(), 0);
        statsCalculator.showStatistics();
    }
}
