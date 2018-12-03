/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Miggy
 * @author Stanley Sie
 */
public class Journalist {
    
    public static final String TABLE_NAME = "Journalist";
    
    private int JournalistID;
    private String emailAddress, password, pictureURL, bio, twitterUserName;
    private Timestamp lastPosted;

    public static final String COL_JOURNALISTID = "JournalistID";
    public static final String COL_EMAILADDRESS = "EmailAddress";
    public static final String COL_PASSWORD = "Password";
    public static final String COL_PICTUREURL = "PictureURL";
    public static final String COL_BIO = "Bio";
    public static final String COL_TWITTERUSERNAME = "TwitterUserName";
    public static final String COL_LASTPOSTED = "LastPosted";
    
    public int getJournalistID() {
        return JournalistID;
    }

    public void setJournalistID(int JournalistID) {
        this.JournalistID = JournalistID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTwitterUserName() {
        return twitterUserName;
    }

    public void setTwitterUserName(String twitterUserName) {
        this.twitterUserName = twitterUserName;
    }

    public Timestamp getLastPosted() {
        return lastPosted;
    }

    public void setLastPosted(Timestamp lastPosted) {
        this.lastPosted = lastPosted;
    }
    
    
}
