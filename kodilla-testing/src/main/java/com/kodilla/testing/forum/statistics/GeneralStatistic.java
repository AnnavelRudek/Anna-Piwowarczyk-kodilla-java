package com.kodilla.testing.forum.statistics;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GeneralStatistic {

    private int userCount; //1. liczba uzytkownikow
    private int postCount;//2. liczba postow
    private int commentCount;//3. liczba komentarzy

    private double postAvgPerUser;//4. średnia liczba postow na uzytkownika
    private double commentsAvgPerUser;//5. srednia liczba komentarzy na osobe
    private double commentsAvgPerPost;//6. srednia liczba komentarzy na post

    public void calculateAdvStatistics(Statistics statictics) {
        userCount = statictics.userNames().size();
        postCount = statictics.postCount();
        commentCount = statictics.commentCount();

        if (userCount != 0 && postCount != 0) {
            postAvgPerUser = postCount / userCount;
        } else {
            postAvgPerUser = 0;
        }

        if (userCount != 0 && commentCount != 0) {
            commentsAvgPerPost = commentCount / postCount;
        } else {
            commentsAvgPerPost = 0;
        }
    }

    public void showStatictic(){
        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.println("Statistic: \n"
                + "User count = " + userCount + "\n"
                + "Post count = " + postCount + "\n"
                + "Comment count = " + commentCount + "\n"
                + "Post average per user = " + formatter.format(postAvgPerUser) + "\n"
                + "Comments average per user  = " + formatter.format(commentsAvgPerUser) + "\n"
                + "Comments avegare per post = " + formatter.format(commentsAvgPerPost));
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getPostAvgPerUser() {
        return postAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }

}