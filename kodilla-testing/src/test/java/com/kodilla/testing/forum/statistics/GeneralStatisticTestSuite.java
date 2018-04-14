package com.kodilla.testing.forum.statistics;

import com.github.javafaker.Faker;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GeneralStatisticTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test no. " + testCounter);
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }


    @Test
    public void calculateAdvStatisticPostsTest() {

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
        Assert.assertEquals(38, generalStatictic.getCommentsAvgPerUser(), 0);
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

    @Test
    public void calculateWhenZero(){
        List<String> usersNameList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            usersNameList.add("forumUser");
        }

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(usersNameList);
        when(statisticsMock.commentCount()).thenReturn(0);
        when(statisticsMock.postCount()).thenReturn(0);

        System.out.println("#everything equals zero\n");

        //When
        GeneralStatistic newStatistic = new GeneralStatistic();
        newStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, newStatistic.getPostAvgPerUser(), 0);
        Assert.assertEquals(0, newStatistic.getCommentsAvgPerUser(), 0);
        Assert.assertEquals(0, newStatistic.getCommentsAvgPerPost(), 0);
    }

    @Test
    public void calculateWhenThousand(){
            List<String> usersNameList = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                usersNameList.add("forumUser");
            }

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            when(statisticsMock.userNames()).thenReturn(usersNameList);
            when(statisticsMock.commentCount()).thenReturn(1000);
            when(statisticsMock.postCount()).thenReturn(1000);

        System.out.println("#everything equals thousand\n");

            //When
            GeneralStatistic newStatistic = new GeneralStatistic();
            newStatistic.calculateAdvStatistics(statisticsMock);

            //Then
            Assert.assertEquals(10, newStatistic.getPostAvgPerUser(), 0);
            Assert.assertEquals(10, newStatistic.getCommentsAvgPerUser(), 0);
            Assert.assertEquals(1, newStatistic.getCommentsAvgPerPost(), 0);
        }

    @Test
    public void calculateWhenMoreCommentsTPosts(){
            List<String> usersNameList = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                usersNameList.add("forumUser");
            }

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            when(statisticsMock.userNames()).thenReturn(usersNameList);
            when(statisticsMock.commentCount()).thenReturn(1000);
            when(statisticsMock.postCount()).thenReturn(100);

        System.out.println("#more comments than posts\n");

            //When
            GeneralStatistic newStatistic = new GeneralStatistic();
            newStatistic.calculateAdvStatistics(statisticsMock);

            //Then
            Assert.assertEquals(1000, newStatistic.getCommentCount(), 0);
            Assert.assertEquals(100, newStatistic.getPostCount(), 0);
        }

}
