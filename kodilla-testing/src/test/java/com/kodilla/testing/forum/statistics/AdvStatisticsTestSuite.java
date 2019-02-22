package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    //gdy liczba postów = 0,
    @Test
    public void CalculateAdvStatistics1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStat = new AdvStatistics();
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Test User");
        int postsCount = 0;
        int commentsCount = 7;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When
        advStat.calculateAdvStatistics(statisticsMock);
        //Then
        advStat.showStatistics();
        Assert.assertEquals(7, advStat.getNumberOfComments());
        Assert.assertEquals(0, advStat.getNumberOfPosts());
        Assert.assertEquals(1, advStat.getNumberOfUsers());
        Assert.assertEquals(0, advStat.getAvgCommentsOfPost(), 0);
        Assert.assertEquals(7, advStat.getAvgCommentsOfUser(), 0);
        Assert.assertEquals(0, advStat.getAvgPostsOfUser(), 0);
    }
    //gdy liczba postów = 1000,
    @Test
    public void calculateAdvStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStat = new AdvStatistics();
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Test User");
        int postsCount = 1000;
        int commentsCount = 7;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When
        advStat.calculateAdvStatistics(statisticsMock);
        //Then
        advStat.showStatistics();
        Assert.assertEquals(7, advStat.getNumberOfComments());
        Assert.assertEquals(1000, advStat.getNumberOfPosts());
        Assert.assertEquals(1, advStat.getNumberOfUsers());
        Assert.assertEquals(7/1000, advStat.getAvgCommentsOfPost(), 0);
        Assert.assertEquals(7, advStat.getAvgCommentsOfUser(), 0);
        Assert.assertEquals(1000, advStat.getAvgPostsOfUser(), 0);
    }
    //gdy liczba komentarzy = 0,
    @Test
    public void calculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStat = new AdvStatistics();
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Test User");
        int postsCount = 7;
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When
        advStat.calculateAdvStatistics(statisticsMock);
        //Then
        advStat.showStatistics();
        Assert.assertEquals(0, advStat.getNumberOfComments());
        Assert.assertEquals(7, advStat.getNumberOfPosts());
        Assert.assertEquals(1, advStat.getNumberOfUsers());
        Assert.assertEquals(0, advStat.getAvgCommentsOfPost(), 0);
        Assert.assertEquals(0, advStat.getAvgCommentsOfUser(), 0);
        Assert.assertEquals(7, advStat.getAvgPostsOfUser(), 0);
    }
    //gdy liczba komentarzy < liczba postów,
    @Test
    public void calculateAdvStatistics4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStat = new AdvStatistics();
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Test User");
        int postsCount = 10;
        int commentsCount = 7;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When
        advStat.calculateAdvStatistics(statisticsMock);
        //Then
        advStat.showStatistics();
        Assert.assertEquals(7, advStat.getNumberOfComments());
        Assert.assertEquals(10, advStat.getNumberOfPosts());
        Assert.assertEquals(1, advStat.getNumberOfUsers());
        Assert.assertEquals(7/10, advStat.getAvgCommentsOfPost(), 0);
        Assert.assertEquals(7, advStat.getAvgCommentsOfUser(), 0);
        Assert.assertEquals(10, advStat.getAvgPostsOfUser(), 0);
    }
    //gdy liczba komentarzy > liczba postów,
    @Test
    public void calculateAdvStatistics5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStat = new AdvStatistics();
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Test User");
        int postsCount = 7;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When
        advStat.calculateAdvStatistics(statisticsMock);
        //Then
        advStat.showStatistics();
        Assert.assertEquals(10, advStat.getNumberOfComments());
        Assert.assertEquals(7, advStat.getNumberOfPosts());
        Assert.assertEquals(1, advStat.getNumberOfUsers());
        Assert.assertEquals(10/7, advStat.getAvgCommentsOfPost(), 0);
        Assert.assertEquals(10, advStat.getAvgCommentsOfUser(), 0);
        Assert.assertEquals(7, advStat.getAvgPostsOfUser(), 0);
    }
    //gdy liczba użytkowników = 0,
    @Test
    public void calculateAdvStatistics6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStat = new AdvStatistics();
        List<String> usersNames = new ArrayList<>();
        int postsCount = 7;
        int commentsCount = 7;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When
        advStat.calculateAdvStatistics(statisticsMock);
        //Then
        advStat.showStatistics();
        Assert.assertEquals(7, advStat.getNumberOfComments());
        Assert.assertEquals(7, advStat.getNumberOfPosts());
        Assert.assertEquals(0, advStat.getNumberOfUsers());
        Assert.assertEquals(1, advStat.getAvgCommentsOfPost(), 0);
        Assert.assertEquals(0, advStat.getAvgCommentsOfUser(), 0);
        Assert.assertEquals(0, advStat.getAvgPostsOfUser(), 0);
    }
    //gdy liczba użytkowników = 100
    @Test
    public void calculateAdvStatistics7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStat = new AdvStatistics();
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            usersNames.add("Test User");
        int postsCount = 7;
        int commentsCount = 7;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When
        advStat.calculateAdvStatistics(statisticsMock);
        //Then
        advStat.showStatistics();
        Assert.assertEquals(7, advStat.getNumberOfComments());
        Assert.assertEquals(7, advStat.getNumberOfPosts());
        Assert.assertEquals(100, advStat.getNumberOfUsers());
        Assert.assertEquals(1, advStat.getAvgCommentsOfPost(), 0);
        Assert.assertEquals(7/100, advStat.getAvgCommentsOfUser(), 0);
        Assert.assertEquals(7/100, advStat.getAvgPostsOfUser(), 0);
    }
}
