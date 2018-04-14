package com.kodilla.testing.forum.statistics;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GeneralStatistic {

    private int userCount;
    private int postCount;
    private int commentCount;

    private double postAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

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

        if (userCount != 0 && commentCount != 0) {
            commentsAvgPerUser = commentCount / userCount;
        } else {
            commentsAvgPerUser = 0;
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
                + "Comments avegare per post = " + formatter.format(commentsAvgPerPost) + "\n");
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