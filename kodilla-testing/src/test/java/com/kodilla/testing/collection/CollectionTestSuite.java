package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }
    @After
    public void after() {
        System.out.println("Test case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testArray = new ArrayList<>();
        ArrayList<Integer> expectedArray = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList result = exterminator.exterminate(testArray);
        System.out.println("Testing empty ArrayList");
        //Then
        Assert.assertEquals(expectedArray, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> testArray = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(4, 6));
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList result = exterminator.exterminate(testArray);
        System.out.println("Testing normal ArrayList");
        //Then
        Assert.assertEquals(expectedArray, result);
    }
}
