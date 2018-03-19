package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName)
    {
      this.name = name; //name visible on forum
      this.realName = realName; //real name
    }

    public void addPost(String author, String postBody){ // do nothing

    }

    public void addComment(ForumPost thePost, String author, String commentBody) { //do nothing

    }

    public int getPostsQuantity(){ // return 100 temporatily
        return 100;
    }

    public int getCommentQuantity(){ // return 100 temporarily
        return 100;
    }

    public ForumPost getPost(int postNumber){ // returning null means that the operation was unsuccessful
        return null;
    }

    public ForumComment getComment(int commentNumber){ // ^^
        return null;
    }

    public boolean removeComment(ForumComment theComment){ //return true temporarily
        return true;
    }

    public String getName(){
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
