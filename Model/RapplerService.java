/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapplerdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Article;

/**
 *
 * @author Stanley Sie
 */
public class RapplerService {
    private RapplerDB db;
    private final String SPACE = " ";
    private final String COMMA = ",";
    private final String QUOTE = "\"";
    private final String EQUAL = "=";
    
    public RapplerService(RapplerDB db) {
        this.db = db;
    }
    
    public List <Article> getAllArticle() {
        //GET ARTICLES
        Connection connection = db.getConnection();
        List <Article> articles = new ArrayList<>();
        
        //String sql = "SELECT * FROM " + Article.TABLE_NAME;
        
        try {
            PreparedStatement statement = connection.prepareStatement(/*sql*/"");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()) {
                Article s = new Article();
//                s.setId(rs.getInt(Student.COL_ID));
//                s.setName(rs.getString(Student.COL_NAME));
//                s.setCourse(rs.getString(Student.COL_COURSE));
//                students.add(s);
            }
           
        } catch (SQLException s) {
            s.printStackTrace();
        }
        
        return articles;
    }
    
//    public List <Account> getAllAccounts() {
//        //GET ACCOUNTS
//        Connection connection = db.getConnection();
//        List <Account> accounts = new ArrayList<>();
//        
//        String sql = "SELECT * FROM " + Account.TABLE_NAME;
//        
//        try {
//            PreparedStatement statement = connection.prepareStatement(sql);
//            ResultSet rs = statement.executeQuery();
//            
//            while(rs.next()) {
//                Account s = new Account();
//                s.setAdminID(rs.getString(Account.COL_ADMINID));
//                s.setEmailAddress(rs.getString(Account.COL_EMAILADDRESS));
//                s.setPassword(rs.getString(Account.COL_PASSWORD));
//                s.setBirthday(rs.getDate(Account.COL_BIRTHDAY));
//                s.setFirstName(rs.getString(Account.COL_FIRSTNAME));
//                s.setLastName(rs.getString(Account.COL_LASTNAME));
//                s.setGender(rs.getString(Account.COL_GENDER));
//                s.setDateLastLogin(rs.getDate(Account.COL_DATELASTLOGIN));
//                s.setDateRegistered(rs.getDate(Account.COL_DATEREGISTERED));
//            }
//           
//        } catch (SQLException s) {
//            s.printStackTrace();
//        }
//        
//        return accounts;
//    }
}
