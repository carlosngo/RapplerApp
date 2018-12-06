/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.*;


public class DatabaseController {
    private Connection con;
    private Statement statement;
    
    public DatabaseController() {
        try {
            String host = "jdbc:derby://localhost:1527/Employees;create=true";
            String user = "carlosngo";
            String pass = "carloslhanz1020";
            this.con = DriverManager.getConnection(host, user, pass);
            this.statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                      ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
    /*
        INSERT INTO RAPPLERDB.REGISTERED_USER (EMAILADDRESS, PASSWORD, FIRSTNAME, LASTNAME, BIRTHDAY, GENDER, DATEREGISTERED, LASTLOGGEDIN) 
	VALUES ('johndoe@gmail.com', 'password', 'John', 'Doe', DEFAULT, DEFAULT, DEFAULT, DEFAULT)
    */
    public void addRegisteredUser(R a) {
        
    }
}
