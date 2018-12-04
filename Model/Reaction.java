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
    
    private int reaction, articleID;
    private String IPAddress;

    public static final String COL_REACTION = "Reaction";
    public static final String COL_ARTICLEID = "ArticleID";
    public static final String COL_IPADDRESS = "IPAddress";
    
    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }
    
    
}
