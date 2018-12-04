/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Miggy
 * @author Stanley Sie
 */
public class Journalist extends RegisteredUser {
    
    public static final String TABLE_NAME = "Journalist";
    
    private String journalistID, pictureURL, bio, twitterUserName;
    private Timestamp lastPosted;

    public static final String COL_JOURNALISTID = "JournalistID";
    public static final String COL_PICTUREURL = "PictureURL";
    public static final String COL_BIO = "Bio";
    public static final String COL_TWITTERUSERNAME = "TwitterUserName";
    public static final String COL_LASTPOSTED = "LastPosted";
    
    public Journalist(String emailAddress, String password, String firstName, String lastName,
                            String gender, Date birthday, Date dateRegistered, Timestamp lastLoggedIn,
                            String journalistID, String pictureURL, String bio, String twitterUserName, Timestamp lastPosted) {
        
        super(emailAddress, password, firstName, lastName, gender, birthday, dateRegistered, lastLoggedIn);
        this.journalistID = journalistID;
        this.pictureURL = pictureURL;
        this.bio = bio;
        this.twitterUserName = twitterUserName;
        this.lastPosted = lastPosted;
    }
    
    public String getJournalistID() {
        return journalistID;
    }

    public void setJournalistID(String journalistID) {
        this.journalistID = journalistID;
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
