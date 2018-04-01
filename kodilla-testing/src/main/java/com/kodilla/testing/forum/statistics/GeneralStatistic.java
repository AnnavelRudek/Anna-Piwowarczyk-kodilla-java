package com.kodilla.testing.forum.statistics;

public class GeneralStatistic {

    private int userCount; //1. liczba uzytkownikow
    private int postCount;//2. liczba postow
    private int commentCount;//3. liczba komentarzy

    private double postAvgPerUser;//4. średnia liczba postow na uzytkownika
    private double commentsAvgPerUser;//5. srednia liczba komentarzy na osobe
    private double commentsAvgPerPost;//6. srednia liczba komentarzy na post

    public void calculateAdvStatistics(Statistics statictics){
        userCount = statictics.userNames().size();
        postCount = statictics.postCount();
        commentCount = statictics.commentCount();

        postAvgPerUser = postCount / userCount;
        commentsAvgPerUser = commentCount / userCount;
        commentsAvgPerPost = commentCount / postCount;
    }

    public void showStatictic(){
        System.out.println("Statistic: \n" + "User count = " + userCount + "\n" + "Post count = " + postCount + "\n" + "Post average per user = "
                + postAvgPerUser + "\n" + "Comments average per user  = " + commentsAvgPerUser + "\n" + "Comments avegare per post = " + commentsAvgPerPost);
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
