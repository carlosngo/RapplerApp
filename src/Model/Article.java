/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Miggy
 */
public class Article {

    private int ArticleID;
    private String Category;
    private String Title;
    private String Content;
    private int Views;
    private Timestamp DateTimePublished;
    private Timestamp DateTimeUpdated;
    private ArrayList<Reaction> reactions;
    private ArrayList<Comment> comments;
    private String authorEmail;

    public Article() {
        
    }
    
    public Article(int ArticleID, String Category, String Title, String Content, String author) {
        this.ArticleID = ArticleID;
        this.Category = Category;
        this.Title = Title;
        this.Content = Content;
        this.authorEmail = author;
    }

    
    public ArrayList<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(ArrayList<Reaction> reactions) {
        this.reactions = reactions;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public String getAuthor() {
        return authorEmail;
    }

    public void setAuthor(String author) {
        this.authorEmail = author;
    }

    public int getArticleID() {
        return ArticleID;
    }

    public void setArticleID(int articleID) {
        ArticleID = articleID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getViews() {
        return Views;
    }

    public void setViews(int views) {
        Views = views;
    }

    public Timestamp getDateTimePublished() {
        return DateTimePublished;
    }

    public void setDateTimePublished(Timestamp dateTimePublished) {
        DateTimePublished = dateTimePublished;
    }

    public Timestamp getDateTimeUpdated() {
        return DateTimeUpdated;
    }

    public void setDateTimeUpdated(Timestamp dateTimeUpdated) {
        DateTimeUpdated = dateTimeUpdated;
    }
    
    public void addComment(Comment c) {
        comments.add(c);
    }
    
    public void removeComment(Comment c) {
        comments.remove(c);
    }
    
    public void addReaction(Reaction r) {
        reactions.add(r);
    } 
    
    public void removeReaction(Reaction r) {
        reactions.add(r);
    }
    
    
}
