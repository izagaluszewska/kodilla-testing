package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int usersNumber;
    int postsNumber;
    int commentsNumber;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if (usersNumber > 0) {
            averagePostsPerUser = postsNumber / usersNumber;
        }
        if (usersNumber > 0) {
            averageCommentsPerUser = commentsNumber / usersNumber;
        }
        if (postsNumber > 0) {
            averageCommentsPerPost = commentsNumber / postsNumber;
        }
    }

    public void showStatistics() {
        System.out.println("Users number: " + usersNumber + "\nPosts number: " + postsNumber + "\nComments number: " + commentsNumber + "\nAverage posts per user: " + averagePostsPerUser + "\nAverage comments per user: " + averageCommentsPerUser + "\nAverage comments per post: " + averageCommentsPerPost);
    }
}