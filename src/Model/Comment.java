/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;

/**
 *
 * @author Miggy
 */
public class Comment {

    public int CommentID;
    public int ArticleID;
    public String content;
    public String commenterEmail;
    public Timestamp commentDateTime;

    public int getCommentID() {
        return CommentID;
    }

    public void setCommentID(int CommentID) {
        this.CommentID = CommentID;
    }

    public int getArticleID() {
        return ArticleID;
    }

    public void setArticleID(int ArticleID) {
        this.ArticleID = ArticleID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommenterEmail() {
        return commenterEmail;
    }

    public void setCommentDateTime(Timestamp commentDateTime) {
        this.commentDateTime = commentDateTime;
    }

    public Timestamp getCommentDateTime() {
        return commentDateTime;
    }

    public void setCommenterEmail(String commenterEmail) {
        this.commenterEmail = commenterEmail;
    }

}
