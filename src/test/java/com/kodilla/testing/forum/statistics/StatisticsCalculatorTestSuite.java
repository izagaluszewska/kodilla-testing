package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Before
    public void showTestStart() {
        System.out.println("Test begin");
    }

    @After
    public void showTestEnd() {
        System.out.println("Test end\n");
    }

    @Test
    public void testCalculateAdvStatisticsNoPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        StatisticsCalculator calculator = new StatisticsCalculator();
        //When
        calculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, calculator.postsNumber);
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        StatisticsCalculator calculator = new StatisticsCalculator();
        //When
        calculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1000, calculator.postsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsNoComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);
        StatisticsCalculator calculator = new StatisticsCalculator();
        //When
        calculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, calculator.commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(900);
        StatisticsCalculator calculator = new StatisticsCalculator();
        //When
        calculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1000, calculator.postsNumber);
        Assert.assertEquals(900, calculator.commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(900);
        when(statistics.commentsCount()).thenReturn(1000);
        StatisticsCalculator calculator = new StatisticsCalculator();
        //When
        calculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(900, calculator.postsNumber);
        Assert.assertEquals(1000, calculator.commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsNoUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(usersList);
        StatisticsCalculator calculator = new StatisticsCalculator();
        //When
        calculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, calculator.usersNumber);

    }

    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user # " + i+1);
        }
        when(statistics.usersNames()).thenReturn(usersList);
        StatisticsCalculator calculator = new StatisticsCalculator();
        //When
        calculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, calculator.usersNumber);
    }
}