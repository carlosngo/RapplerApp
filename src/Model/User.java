/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Miggy
 */
public class User {

    private String EmailAddress;
    private String Password;
    private String Role;
    private String FirstName;
    private String LastName;
    private String Bio;
    private ArrayList<Article> works;
    private Date Birthday;
    private String Gender;
    private Timestamp DateTimeRegistered;
    private Timestamp LastLoggedIn;
    
    public User() {
        
    }
    
    public User(String EmailAddress, String Password, String Role, String FirstName, String LastName, Date Birthday, String Gender) {
        this.EmailAddress = EmailAddress;
        this.Password = Password;
        this.Role = Role;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Birthday = Birthday;
        this.Gender = Gender;
    }

    
    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String Bio) {
        this.Bio = Bio;
    }

    public ArrayList<Article> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<Article> works) {
        this.works = works;
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
    
    public void publishArticle(Article a) {
        works.add(a);
    }
}
