/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Miggy
 */
public class Journalist {
    
    private int JournalistID;
    private String EmailAddress;
    private String Password;
    private String PictureURL;
    private String Bio;
    private String TwitterUserName;
    private String DateTimeRegistered;
    private String LastPosted;
    
    public Journalist(){
        //
    }
    
    
    
    
    public int getJournalistID() {
        return JournalistID;
    }
    public void setJournalistID(int journalistID) {
        JournalistID = journalistID;
    }
    public String getEmailAddress() {
	return EmailAddress;
    }
    public void setEmailAddress(String emailAddress) {
	EmailAddress = emailAddress;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
	Password = password;
    }
    public String getPictureURL() {
	return PictureURL;
    }
    public void setPictureURL(String pictureURL) {
	PictureURL = pictureURL;    
    }
    public String getBio() {
	return Bio;
    }
    public void setBio(String bio) {
        Bio = bio;
    }
    public String getTwitterUserName() {
	return TwitterUserName;
    }
    public void setTwitterUserName(String twitterUserName) {
	TwitterUserName = twitterUserName;
    }
    public String getDateTimeRegistered() {
	return DateTimeRegistered;
    }
    public void setDateTimeRegistered(String dateTimeRegistered) {
	DateTimeRegistered = dateTimeRegistered;
    }
    public String getLastPosted() {
	return LastPosted;
    }
    public void setLastPosted(String lastPosted) {
	LastPosted = lastPosted;
    }
    
}
