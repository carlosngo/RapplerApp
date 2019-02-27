/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.*;
import java.sql.*;


public class Database {
    public static final String ARTICLE_TABLE = "RapplerDB.Article";
    public static final String ARTICLE_COLUMNS = "ArticleID, Category, Title, Content, DateTimePublished, DateTimeUpdated, Views";
    
    public static final String USER_TABLE = "RapplerDB.Registered_User";
    public static final String USER_COLUMNS = "EmailAddress, Password, FirstName, LastName, Birthday, DateRegistered, LastLoggedIn, Gender, Role, Bio";
    
    public static final String COMMENT_TABLE = "RapplerDB.Comment";
    public static final String COMMENT_COLUMNS = "CommentID, Content, ArticleID, EmailAddress, CommentDateTime";
    
    public static final String REACTION_TABLE = "RapplerDB.Reaction";
    public static final String REACTION_COLUMNS = "ArticleID, Reaction, ReactionID, EmailAddress";
    
    public static final String AUTHOR_TABLE = "RapplerDB.Author";
    
    public static Connection getConnection() throws Exception {
        String host = "";
        String user = "";
        String pass = "";
        return DriverManager.getConnection(host, user, pass);
    }
    
}
