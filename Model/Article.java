/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Miggy
 * @author Stanley Sie
 */
public class Article {
    
    public static final String TABLE_NAME = "article";
    
    private int articleID, views;
    private String category, title, content, articleURL, imageURL, comment, reaction, author;
    private Date datePublished, dateUpdated;
    private Time timePublished, timeUpdated;
    
    public static final String COL_ARTICLEID = "ArticleID";
    public static final String COL_VIEWS = "Views";
    public static final String COL_CATEGORY = "Category";
    public static final String COL_TITLE = "Title";
    public static final String COL_CONTENT = "Content";
    public static final String COL_ARTICLEURL = "ArticleURL";
    public static final String COL_IMAGEURL = "ImageURL";
    public static final String COL_COMMENT = "Comment";
    public static final String COL_REACTION = "Reaction";
    public static final String COL_AUTHOR = "Author";
    public static final String COL_DATEPUBLISHED = "DatePublished";
    public static final String COL_DATEUPDATED = "DateUpdated";
    public static final String COL_TIMEPUBLISHED = "TimePublished";
    public static final String COL_TIMEUPDATED = "TimeUpdated";   
    
    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticleURL() {
        return articleURL;
    }

    public void setArticleURL(String articleURL) {
        this.articleURL = articleURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Time getTimePublished() {
        return timePublished;
    }

    public void setTimePublished(Time timePublished) {
        this.timePublished = timePublished;
    }

    public Time getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(Time timeUpdated) {
        this.timeUpdated = timeUpdated;
    }
    
    
}
