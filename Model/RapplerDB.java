/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapplerdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Stanley Sie
 */
public class RapplerDB {
    
    private final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "mysql2018";
    private final static String DATABASE = "rapplerdb";

    public Connection getConnection() {
        try {
            Class.forName(DRIVER_NAME);
            Connection connection = DriverManager.getConnection(
                URL + DATABASE + "?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Asia/Hong_Kong", USERNAME, PASSWORD
            );
            System.out.println("[MYSQL] Connection successful!");
            return connection;
        } catch (SQLException e) {
            System.out.println("[MYSQL] Was not able to connect!");
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("[MYSQL] Was not able to connect!");
            c.printStackTrace();
            return null;
        }
    }
}