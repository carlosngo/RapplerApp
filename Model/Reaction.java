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
public class Reaction {
    
    public static final String TABLE_NAME = "Reaction";
    
    private String reaction, articleID, sessionID;

    public static final String COL_REACTION = "Reaction";
    public static final String COL_ARTICLEID = "ArticleID";
    public static final String COL_SESSIONID = "SessionID";
    
    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
    
    
}
