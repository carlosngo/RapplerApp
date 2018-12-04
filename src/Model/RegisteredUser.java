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
public class RegisteredUser extends User {

    private String EmailAddress;
    private String Password;
    private String FirstName;
    private String LastName;
    private Date Birthday;
    private boolean Gender;
    private Timestamp DateTimeRegistered;
    private Timestamp LastLoggerIn;

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

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public Timestamp getLastLoggerIn() {
        return LastLoggerIn;
    }

    public void setLastLoggerIn(Timestamp LastLoggerIn) {
        this.LastLoggerIn = LastLoggerIn;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }

    public Timestamp getDateTimeRegistered() {
        return DateTimeRegistered;
    }

    public void setDateTimeRegistered(Timestamp dateTimeRegistered) {
        DateTimeRegistered = dateTimeRegistered;
    }

    public Timestamp getLastLoggedIn() {
        return LastLoggerIn;
    }

    public void setLastLoggedIn(Timestamp lastLoggerIn) {
        LastLoggerIn = lastLoggerIn;
    }

}
