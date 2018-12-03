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
public class User {
    
    public static final String TABLE_NAME = "User";
    
    private String emailAddress, password, firstName, lastName, gender, adminID;
    private Date birthday, dateRegistered;
    private Timestamp lastLoggedIn;

    public static final String COL_EMAILADDRESS = "EmailAddress";
    public static final String COL_PASSWORD = "Password";
    public static final String COL_FIRSTNAME = "FirstName";
    public static final String COL_LASTNAME = "LastName";
    public static final String COL_GENDER = "Gender";
    public static final String COL_ADMINID = "AdminID";
    public static final String COL_BIRHTDAY = "Birhtday";
    public static final String COL_DATEREGISTERED = "DateRegistered";
    public static final String COL_LASTLOGGEDIN = "LastLoggedIn";
    
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Timestamp getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(Timestamp lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }
    
    
}
