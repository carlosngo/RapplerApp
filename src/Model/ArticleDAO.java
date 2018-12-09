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

    private static final String SQL_FIND_BY_ID
            = "SELECT " + Database.ARTICLE_COLUMNS + " FROM " + Database.ARTICLE_TABLE + " WHERE ArticleID = ? ";
    private static final String SQL_LIST_BY_ID
            = "SELECT " + Database.ARTICLE_COLUMNS + " FROM " + Database.ARTICLE_TABLE + " ORDER BY ArticleID FETCH FIRST 8 ROWS ONLY";
    private static final String SQL_LIST_BY_TITLE
            = "SELECT " + Database.ARTICLE_COLUMNS + " FROM " + Database.ARTICLE_TABLE + " WHERE Title LIKE ?";
    private static final String SQL_LIST_ORDER_BY_VIEWS
            = "SELECT " + Database.ARTICLE_COLUMNS + " FROM " + Database.ARTICLE_TABLE + " ORDER BY Views DESC FETCH FIRST 3 ROWS ONLY";
    private static final String SQL_LIST_ORDER_BY_DATE
            = "SELECT " + Database.ARTICLE_COLUMNS + " FROM " + Database.ARTICLE_TABLE + " ORDER BY DateTimePublished";
    private static final String SQL_LIST_BY_CATEGORY
            = "SELECT " + Database.ARTICLE_COLUMNS + " FROM " + Database.ARTICLE_TABLE + " WHERE Category = ? FETCH FIRST 8 ROWS ONLY";
    private static final String SQL_LIST_BY_AUTHOR
            = "SELECT Article.ArticleID, Category, Title, Content, DateTimePublished, DateTimeUpdated, Views FROM " + Database.ARTICLE_TABLE + " INNER JOIN " + Database.AUTHOR_TABLE + " ON " + Database.ARTICLE_TABLE + ".ArticleID = " + Database.AUTHOR_TABLE + ".ArticleID WHERE EmailAddress = ?";
    private static final String SQL_INSERT
            = "INSERT INTO " + Database.ARTICLE_TABLE + " (Category, Title, Content, DateTimePublished, DateTimeUpdated, Views) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE
            = "UPDATE " + Database.ARTICLE_TABLE + " SET Category = ?, Title = ?, Content = ?, DateTimePublished = ?, DateTimeUpdated = ?, Views = ? WHERE ArticleID = ?";
    private static final String SQL_DELETE
            = "DELETE FROM " + Database.ARTICLE_TABLE + " WHERE ArticleID = ?";

    public ArrayList<Article> findAll() throws Exception {
        ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_BY_ID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                articles.add(map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    public Article findById(int ArticleID) throws Exception {
        Article art = null;
        Object[] values = {
            ArticleID
        };
        try {
            Connection connection = Database.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_FIND_BY_ID);
            for (int i = 0; i < values.length; i++) {
                statement.setObject(i + 1, values[i]);
            }
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                art = map(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return art;
    }

    public ArrayList<Article> findById() throws Exception {
        ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_BY_ID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                articles.add(map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    public ArrayList<Article> findByTitle(String Title) throws Exception {
        ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_BY_TITLE);
            stmt.setString(1, "%" + Title + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                articles.add(map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    public ArrayList<Article> findByViews() throws Exception {
        ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_ORDER_BY_VIEWS);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                articles.add(map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    public ArrayList<Article> findByDate() throws Exception {
        ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_ORDER_BY_DATE);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                articles.add(map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    public ArrayList<Article> findByCategory(String cat) throws Exception {
        ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_BY_CATEGORY);
            stmt.setString(1, cat);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                articles.add(map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    public ArrayList<Article> findByAuthor(String authorEmail) throws Exception {
        ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            System.out.println(SQL_LIST_BY_AUTHOR);
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_BY_AUTHOR);
            stmt.setString(1, authorEmail);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                articles.add(map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

    public void insertArticle(Article a) throws Exception {
        Object[] values = {
            a.getCategory(),
            a.getTitle(),
            a.getContent(),
            new Timestamp(new java.util.Date().getTime()),
            new Timestamp(new java.util.Date().getTime()),
            0
        };
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT);
            for (int i = 0; i < values.length; i++)
                stmt.setObject(i + 1, values[i]);
            stmt.executeUpdate();
//            ResultSet rs = stmt.getGeneratedKeys();
//            a.setArticleID(rs.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateArticle(Article a) throws Exception {
        Object[] values = {
            a.getCategory(),
            a.getTitle(),
            a.getContent(),
            new Timestamp(new java.util.Date().getTime()),
            new Timestamp(new java.util.Date().getTime()),
            0,
            a.getArticleID()
        };
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_UPDATE);
            for (int i = 0; i < values.length; i++)
                stmt.setObject(i + 1, values[i]);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteArticle(Article a) throws Exception {
        Object[] values = {
            a.getArticleID()
        };
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_DELETE);
            for (int i = 0; i < values.length; i++)
                stmt.setObject(i + 1, values[i]);
            stmt.executeUpdate();
            a = new Article();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Article map(ResultSet resultSet) throws SQLException {
        Article art = new Article();
        art.setArticleID(resultSet.getInt("ArticleID"));
        art.setCategory(resultSet.getString("Category"));
        art.setTitle(resultSet.getString("Title"));
        art.setContent(resultSet.getString("Content"));
        art.setDateTimePublished(resultSet.getTimestamp("DateTimePublished"));
        art.setDateTimeUpdated(resultSet.getTimestamp("DateTimeUpdated"));
        return art;
    }
}
