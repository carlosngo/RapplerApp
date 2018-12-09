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
public class CommentDAO {
    private static final String SQL_LIST_BY_ARTICLEID
            = "SELECT " + Database.COMMENT_COLUMNS + " FROM " + Database.COMMENT_TABLE + " WHERE ArticleID = ?";
    private static final String SQL_INSERT
            = "INSERT INTO " + Database.COMMENT_TABLE + " (Content, ArticleID, EmailAddress, CommentDateTime) VALUES (?, ?, ?, ?)";
    private static final String SQL_DELETE
            = "DELETE FROM " + Database.COMMENT_TABLE + " WHERE CommentID = ?";     
    
    public ArrayList<Comment> findByArticleID(int ArticleID) throws Exception {
        ArrayList<Comment> comments = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_BY_ARTICLEID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                comments.add(map(rs));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
    
       public void insert(Comment c) throws Exception {
        Object[] values = {
            c.getContent(),
            c.getArticleID(),
            c.getCommenterEmail(),
            new Timestamp(new java.util.Date().getTime()),
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
    
    public void delete(Comment c) throws Exception {
        Object[] values = {
            c.getCommentID()
        };
        
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_DELETE);
            for (int i = 0; i < values.length; i++)
                stmt.setObject(i + 1, values[i]);
            stmt.executeUpdate();
            c = new Comment();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Comment map(ResultSet rs) throws Exception {
        Comment c = new Comment();
        c.setArticleID(rs.getInt("ArticleID"));
        c.setContent(rs.getString("Content"));
        c.setCommentID(rs.getInt("CommentID"));
        c.setCommenterEmail(rs.getString("EmailAddress"));
        c.setCommentDateTime(rs.getTimestamp("CommentDate"));
        return c;
    }
}
