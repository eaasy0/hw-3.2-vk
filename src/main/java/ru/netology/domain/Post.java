package ru.netology.domain;

public class Post {

    private int id;
    private int postId;
    private int date;
    private String username;
    private String text;
    private String postImage;
    private String likes;
    private String commentsInfo;


    public void setCommentsInfo(String commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
    public String getCommentsInfo() {
        return commentsInfo;
    }
}
