/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;

/**
 *
 * @author Carlos
 */

public class AuthorDAO {
    private static final String SQL_INSERT
            = "INSERT INTO " + Database.AUTHOR_TABLE + " (ArticleID, EmailAddress) VALUES (?, ?)";
    private static final String SQL_DELETE
            = "DELETE FROM " + Database.AUTHOR_TABLE + " WHERE ArticleID = ?";
    
    public void insert(User u, Article a) throws Exception {
        Object[] values = {
            a.getArticleID(),
            u.getEmailAddress()
        };
        
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT);
            for (int i = 0; i < values.length; i++)
                stmt.setObject(i + 1, values[i]);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(Article a) throws Exception {
        Object[] values = {
            a.getArticleID()
        };
        
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_DELETE);
            for (int i = 0; i < values.length; i++)
                stmt.setObject(i + 1, values[i]);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
