/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
/**
 *
 * @author Carlos
 */
public class RegisteredRegisteredUserDAO {
    private static final String SQL_FIND_BY_ID =
        "SELECT id, email, firstname, lastname, birthdate FROM RegisteredUser WHERE id = ?";
    private static final String SQL_FIND_BY_EMAIL_AND_PASSWORD =
        "SELECT id, email, firstname, lastname, birthdate FROM RegisteredUser WHERE email = ? AND password = MD5(?)";
    private static final String SQL_LIST_ORDER_BY_ID =
        "SELECT id, email, firstname, lastname, birthdate FROM RegisteredUser ORDER BY id";
    private static final String SQL_INSERT =
        "INSERT INTO RegisteredUser (email, password, firstname, lastname, birthdate) VALUES (?, MD5(?), ?, ?, ?)";
    private static final String SQL_UPDATE =
        "UPDATE RegisteredUser SET email = ?, firstname = ?, lastname = ?, birthdate = ? WHERE id = ?";
    private static final String SQL_DELETE =
        "DELETE FROM RegisteredUser WHERE id = ?";
    private static final String SQL_EXIST_EMAIL =
        "SELECT id FROM RegisteredUser WHERE email = ?";
    private static final String SQL_CHANGE_PASSWORD =
        "UPDATE RegisteredUser SET password = MD5(?) WHERE id = ?";
    
    /**@param id The ID of the user to be returned.
     * @return The user from the database matching the given ID, otherwise null.
     *  If something fails at database level.
     */
    public RegisteredUser find(Long id) {
        
    }

    /**
     * Returns the user from the database matching the given email and password, otherwise null.
     * @param email The email of the user to be returned.
     * @param password The password of the user to be returned.
     * @return The user from the database matching the given email and password, otherwise null.
     
     */
    public RegisteredUser find(String email, String password) {
        
    }

    /**t
     * Returns a list of all users from the database ordered by user ID. The list is never null and
     * is empty when the database does not contain any user.
     * @return A list of all users from the database ordered by user ID.
     *  If something fails at database level.
     */
    public ArrayList<RegisteredUser> findAll() {
        
    }

    /**
     * Create the given user in the database. The user ID must be null, otherwise it will throw
     * IllegalArgumentException. After creating, the DAO will set the obtained ID in the given user.
     * @param user The user to be created in the database.
     * 
     *  If something fails at database level.
     */
    public void create(RegisteredUser user) {
        
    }

    /**
     * Update the given user in the database. The user ID must not be null, otherwise it will throw
     * IllegalArgumentException. Note: the password will NOT be updated. Use changePassword() instead.
     * @param user The user to be updated in the database.
     * 
     *  If something fails at database level.
     */
    public void update(RegisteredUser user) {
        
    }

    /**
     * Delete the given user from the database. After deleting, the DAO will set the ID of the given
     * user to null.
     * @param user The user to be deleted from the database.
     *  If something fails at database level.
     */
    public void delete(RegisteredUser user) {
        
    }

    /**
     * Returns true if the given email address exist in the database.
     * @param email The email address which is to be checked in the database.
     * @return True if the given email address exist in the database.
     *  If something fails at database level.
     */
    public boolean existEmail(String email) {
        
    }

    /**
     * Change the password of the given user. The user ID must not be null, otherwise it will throw
     * IllegalArgumentException.
     * @param user The user to change the password for.
     * 
     *  If something fails at database level.
     */
    public void changePassword(RegisteredUser user) {
        
    }
}
