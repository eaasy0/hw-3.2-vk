package ru.netology.domain;

public class Post {

    private int id;
    private int ownerId;
    private int fromID;
    private int createdBy;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String commentsInfo;
    private String copyright;
    private String likesInfo;
    private String repostsInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(String commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(String likesInfo) {
        this.likesInfo = likesInfo;
    }

    public String getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(String repostsInfo) {
        this.repostsInfo = repostsInfo;
    }
}
