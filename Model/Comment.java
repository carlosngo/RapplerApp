/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Miggy
 * @author Stanley Sie
 */
public class Comment {
    
    public static final String TABLE_NAME = "Comment";
    
    private String articleID, comment, commenterEmail;
    private Date date;

    public static final String COL_ARTICLEID = "ArticleID";
    public static final String COL_COMMENT = "Comment";
    public static final String COL_COMMENTEREMAIL = "CommenterEmail";
    public static final String COL_DATE = "Date";
    
    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommenterEmail() {
        return commenterEmail;
    }

    public void setCommenterEmail(String commenterEmail) {
        this.commenterEmail = commenterEmail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
