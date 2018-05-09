package com.kodilla.patterns.strategy.social;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Struct;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {
    @Before
    public void beforeClass(){
        System.out.println("Test Case - Start!");
    }

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new ZGeneration("Zenek");
        User user2 = new YGeneration("Ygor");
        User user3 = new Millenials("Milla");

        //When
        String user1Share = user1.sharePost();
        System.out.println("User 1 posted by; " + user1Share);

        String user2Share = user2.sharePost();
        System.out.println("User 2 posted by: " + user2Share);

        String user3Share = user3.sharePost();
        System.out.println("User 3 posted by: " + user3Share + "\n");

        //Then

        assertEquals("Twitter", user1Share);
        assertEquals("Snapchat", user2Share);
        assertEquals("Facebook", user3Share);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user1 = new ZGeneration("Zenek");

        //When
        String user1Share = user1.sharePost();
        System.out.println("User 1 posted by; " + user1Share);

        user1.setSharingStrategy(new FacebookPublisher());
        user1Share = user1.sharePost();
        System.out.println("User 1 now posts by: " + user1Share);

        //Then
        assertEquals("Facebook", user1Share);
    }

}
