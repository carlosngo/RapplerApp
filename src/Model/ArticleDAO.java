/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;
import java.sql.*;

/**
 *
 * @author Carlos
 */
public class ArticleDAO {
    private static final String SQL_FIND_BY_ID =
        "SELECT id, email, firstname, lastname, birthdate FROM User WHERE id = ?";
    private static final String SQL_FIND_BY_EMAIL_AND_PASSWORD =
        "SELECT id, email, firstname, lastname, birthdate FROM User WHERE email = ? AND password = MD5(?)";
    private static final String SQL_LIST_ORDER_BY_ID =
        "SELECT id, email, firstname, lastname, birthdate FROM User ORDER BY id";
    private static final String SQL_INSERT =
        "INSERT INTO User (email, password, firstname, lastname, birthdate) VALUES (?, MD5(?), ?, ?, ?)";
    private static final String SQL_UPDATE =
        "UPDATE User SET email = ?, firstname = ?, lastname = ?, birthdate = ? WHERE id = ?";
    private static final String SQL_DELETE =
        "DELETE FROM User WHERE id = ?";
    private static final String SQL_EXIST_EMAIL =
        "SELECT id FROM User WHERE email = ?";
    private static final String SQL_CHANGE_PASSWORD =
        "UPDATE User SET password = MD5(?) WHERE id = ?";
            
    public ArrayList<Article> findAll() {
        
    }
    
    public Article findById(int ArticleID) throws Exception {
       
    }
    
    public ArrayList<Article> findByTitle(String Title) {
        
    }
    public ArrayList<Article> findByViews() {
        
    }
    public ArrayList<Article> findByTime() {
        
    }
    
    public ArrayList<Article> findByCategory() {
        
    }
    
    public boolean insertArticle(Article a) {
        
    }
    public boolean updateArticle(Article a) {
        
    }
    public boolean deleteArticle(Article a) {
        
    }
 
}
