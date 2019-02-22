package com.kodilla.testing.forum.statistics;

public class AdvStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsOfUser;
    private double avgCommentsOfUser;
    private double avgCommentsOfPost;

    public boolean calculateAdvStatistics(Statistics statistics){
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if( numberOfUsers != 0) {
            this.avgPostsOfUser = this.numberOfPosts / this.numberOfUsers;
            this.avgCommentsOfUser = this.numberOfComments / this.numberOfUsers;
        }
        if( numberOfPosts != 0) {
            this.avgCommentsOfPost = this.numberOfComments / this.numberOfPosts;
        }
        return true;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsOfUser() {
        return avgPostsOfUser;
    }

    public double getAvgCommentsOfUser() {
        return avgCommentsOfUser;
    }

    public double getAvgCommentsOfPost() {
        return avgCommentsOfPost;
    }

    public void showStatistics(){
        System.out.println("Number of users: " + getNumberOfUsers());
        System.out.println("Number of posts: " + getNumberOfPosts());
        System.out.println("Number of comments: " + getNumberOfComments());
        System.out.println("Average number of user posts: " + getAvgPostsOfUser());
        System.out.println("Average number of user comments: " + getAvgCommentsOfUser());
        System.out.println("Average number of post comments: " + getAvgCommentsOfPost());
    }
}
