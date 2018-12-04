/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Miggy
 * @author Stanley Sie
 */
public class Author {
    
    public static final String TABLE_NAME = "author";
    
    private String articleID, authorEmail;
    
    public static final String COL_ARTICLEID = "ArticleID";
    public static final String COL_AUTHOREMAIL = "AuthorEmail";
    
    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }
    
    
}
