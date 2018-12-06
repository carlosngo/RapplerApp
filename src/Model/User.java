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
public class User {

    private String EmailAddress;
    private String Password;
    private String FirstName;
    private String LastName;
    private Date Birthday;
    private String Gender;
    private Timestamp DateTimeRegistered;
    private Timestamp LastLoggedIn;

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

    public Timestamp getLastLoggedIn() {
        return LastLoggedIn;
    }

    public void setLastLoggedIn(Timestamp LastLoggedIn) {
        this.LastLoggedIn = LastLoggedIn;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Timestamp getDateTimeRegistered() {
        return DateTimeRegistered;
    }

    public void setDateTimeRegistered(Timestamp dateTimeRegistered) {
        DateTimeRegistered = dateTimeRegistered;
    }

}
