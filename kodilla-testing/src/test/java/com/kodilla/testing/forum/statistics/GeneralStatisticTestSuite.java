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
    public void calculateAdvStatisticPostsTest () {

        //Given
        Statistics statisticksMock = mock(Statistics.class);
        GeneralStatistic generalStatictic = new GeneralStatistic();

        int userCount = 67;
        List<String> usersNameList = ListOfUsersName(userCount);
        int postCount = 517;
        int commentCount = 2600;

        when(statisticksMock.userNames()).thenReturn(usersNameList);
        when(statisticksMock.postCount()).thenReturn(postCount);
        when(statisticksMock.commentCount()).thenReturn(commentCount);

        //When
        generalStatictic.calculateAdvStatistics(statisticksMock);
        generalStatictic.showStatictic();

        //Then
        Assert.assertEquals(5, generalStatictic.getCommentsAvgPerPost(), 0);
        Assert.assertEquals(38, generalStatictic.getCommentsAvgPerUser(), 38);
        Assert.assertEquals(7, generalStatictic.getPostAvgPerUser(), 0);
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
