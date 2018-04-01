package com.kodilla.testing.forum.statistics;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GeneralStatisticTestSuite {

    @Test
    public void calculateAdvStatisticPostsTest (Statistics statictics) {

        //Given
        Statistics statisticksMock = mock(Statistics.class);
        GeneralStatistic generalStatictic = new GeneralStatistic();

        int userCount = 50;
        List<String> usersNameList = ListOfUsersName(userCount);
        int postCount = 130;
        int commentCount = 280;

        when(statisticksMock.userNames()).thenReturn(usersNameList);
        when(statisticksMock.postCount()).thenReturn(postCount);
        when(statisticksMock.commentCount()).thenReturn(commentCount);

        //When
        generalStatictic.calculateAdvStatistics(statisticksMock);
        generalStatictic.showStatictic();

        //Then
        Assert.assertEquals(5, generalStatictic.getCommentsAvgPerPost(), 0);
        Assert.assertEquals(63, generalStatictic.getCommentsAvgPerUser(), 0);
        Assert.assertEquals(6, generalStatictic.getPostAvgPerUser(), 0);
    }

    private List<String> ListOfUsersName(int usersCount) {
        Faker faker = new Faker();
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            String userName = faker.name().firstName();
            usersNamesList.add(userName);
        }
        return usersNamesList;
    }

}
