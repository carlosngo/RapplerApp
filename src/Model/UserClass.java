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
public class UserClass {
    private String EmailAddress;
    private String Password;
    private String FirstName;
    private String LastName;
    private String Birthday;
    private boolean Gender;
    private String DateTimeRegistered;
    private String LastLoggerIn;
    private String AdmnID;
    
    public UserClass(){
        //
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
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public boolean isGender() {
		return Gender;
	}
	public void setGender(boolean gender) {
		Gender = gender;
	}
	public String getDateTimeRegistered() {
		return DateTimeRegistered;
	}
	public void setDateTimeRegistered(String dateTimeRegistered) {
		DateTimeRegistered = dateTimeRegistered;
	}
	public String getLastLoggerIn() {
		return LastLoggerIn;
	}
	public void setLastLoggerIn(String lastLoggerIn) {
		LastLoggerIn = lastLoggerIn;
	}
	public String getAdmnID() {
		return AdmnID;
	}
	public void setAdmnID(String admnID) {
		AdmnID = admnID;
	}

    
}
