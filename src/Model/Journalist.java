/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Miggy
 */
public class Journalist extends RegisteredUser {

    private int JournalistID;
    private String Bio;
    private Timestamp DateTimeRegistered;
    private Timestamp LastPosted;
    private ArrayList<Article> works;

    public Timestamp getDateTimeRegistered() {
        return DateTimeRegistered;
    }

    public void setDateTimeRegistered(Timestamp DateTimeRegistered) {
        this.DateTimeRegistered = DateTimeRegistered;
    }

    public ArrayList<Article> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<Article> works) {
        this.works = works;
    }

    public int getJournalistID() {
        return JournalistID;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public Timestamp getLastPosted() {
        return LastPosted;
    }

    public void setLastPosted(Timestamp lastPosted) {
        LastPosted = lastPosted;
    }

    public void addArticle(Article a) {
        works.add(a);
    }
}
