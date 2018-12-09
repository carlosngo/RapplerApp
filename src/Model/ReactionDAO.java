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
public class ReactionDAO {
    private static final String SQL_LIST_BY_ARTICLEID
            = "SELECT " + Database.REACTION_COLUMNS + " FROM " + Database.REACTION_TABLE + " WHERE ArticleID = ?";
    private static final String SQL_INSERT
            = "INSERT INTO " + Database.REACTION_TABLE + " (ArticleID, Reaction, EmailAddress) VALUES (?, ?, ?)";
    private static final String SQL_DELETE
            = "DELETE FROM " + Database.REACTION_TABLE + " WHERE ReactionID = ?";        
    public ArrayList<Reaction> findByArticleID(int ArticleID) throws Exception {
        ArrayList<Reaction> reactions = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_BY_ARTICLEID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                reactions.add(map(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reactions;
    }
    
    public void insert(Reaction r) throws Exception {
        Object[] values = {
            r.getArticleID(),
            r.getReaction(),
            r.getEmailAddress()
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
    
    public void delete(Reaction r) throws Exception {
        Object[] values = {
            r.getReactionID()
        };
        
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_DELETE);
            for (int i = 0; i < values.length; i++)
                stmt.setObject(i + 1, values[i]);
            stmt.executeUpdate();
            r = new Reaction();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Reaction map(ResultSet rs) throws Exception {
        Reaction r = new Reaction();
        r.setArticleID(rs.getInt("ArticleID"));
        r.setReaction(rs.getString("Reaction"));
        r.setReactionID(rs.getInt("ReactionID"));
        r.setEmailAddress(rs.getString("EmailAddress"));
        return r;
    }
}
