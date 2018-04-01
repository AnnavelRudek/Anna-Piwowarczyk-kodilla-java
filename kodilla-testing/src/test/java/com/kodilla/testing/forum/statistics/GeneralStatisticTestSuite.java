package com.kodilla.testing.forum.statistics;

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

        int postCount = 100;
        int commentCount = 200;

        when(statisticksMock.userNames()).thenReturn(userCount);
        when(statisticksMock.postCount()).thenReturn(postCount);
        when(statisticksMock.commentCount()).thenReturn(commentCount);

        //When
        generalStatictic.calculateAdvStatistics(statisticksMock);
        generalStatictic.showStatictic();

        //Then
        Assert.assertEquals(commentCount / postCount, generalStatictic.getCommentsAvgPerPost(), 0);
        Assert.assertEquals(commentCount / userCount, generalStatictic.getCommentsAvgPerUser(), 0);
        Assert.assertEquals(postCount / userCount, generalStatictic.getPostAvgPerUser(), 0);
    }

        private List<String> ListOfUsersName(int userCount) {
            Monkey monkey = new monkey();
            List<String> usersNameList = new ArrayList<>();
            for (int n = 1; n <= userCount; n++) {
                String userName = monkey.realname().firstName();
                usersNameList.add(userName);
            }
            return usersNameList;
    }

}
