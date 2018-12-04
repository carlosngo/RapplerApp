/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Stanley Sie
 */
public class Admin extends RegisteredUser {
    
    public Admin(String emailAddress, String password, String firstName, String lastName,
                            String gender, Date birthday, Date dateRegistered, Timestamp lastLoggedIn) {
        super(emailAddress, password, firstName, lastName, gender, birthday, dateRegistered, lastLoggedIn);
    }
}
