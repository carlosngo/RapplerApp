/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.*;
import java.sql.*;


public class Database {

    /*
        INSERT INTO RAPPLERDB.REGISTERED_USER (EMAILADDRESS, PASSWORD, FIRSTNAME, LASTNAME, BIRTHDAY, GENDER, DATEREGISTERED, LASTLOGGEDIN) 
	VALUES ('johndoe@gmail.com', 'password', 'John', 'Doe', DEFAULT, DEFAULT, DEFAULT, DEFAULT)
    */
    public static Connection getConnection() throws Exception {
        String host = "jdbc:derby://localhost:1527/Employees;create=true";
        String user = "carlosngo";
        String pass = "carloslhanz1020";
        return DriverManager.getConnection(host, user, pass);
    }
}
