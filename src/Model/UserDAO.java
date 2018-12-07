/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Carlos
 */
public class UserDAO {

    private static final String SQL_FIND_BY_EMAIL_AND_PASSWORD
            = "SELECT " + Database.USER_COLUMNS + " FROM " + Database.USER_TABLE + " WHERE EmailAddress = ? AND Password = ?";
    private static final String SQL_LIST_ORDER_BY_EMAIL
            = "SELECT " + Database.USER_COLUMNS + " FROM " + Database.USER_TABLE + " ORDER BY EmailAddress";
    private static final String SQL_INSERT
            = "INSERT INTO " + Database.USER_TABLE + " (" + Database.USER_COLUMNS + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE
            = "UPDATE " + Database.USER_TABLE + " SET EmailAddress = ?, Password = ?, FirstName = ?, LastName = ?, Birthday = ?, DateRegistered = ?, LastLoggedIn = ?, Gender = ?, Role = ?, Bio = ? WHERE EmailAddress = ?";
    private static final String SQL_DELETE
            = "DELETE FROM " + Database.USER_TABLE + " WHERE EmailAddress = ?";
    private static final String SQL_EXIST_EMAIL
            = "SELECT EmailAddress FROM " + Database.USER_TABLE + " WHERE EmailAddress = ?";

    /**
     * Returns the user from the database matching the given email and password,
     * otherwise null.
     *
     * @param email The email of the user to be returned.
     * @param password The password of the user to be returned.
     * @return The user from the database matching the given email and password,
     * otherwise null.
     *
     */
    public User find(String email, String password) throws Exception {
        return find(SQL_FIND_BY_EMAIL_AND_PASSWORD, email, password);
    }

    public User find(String sql, Object... values) throws Exception {
        User user = null;

        try {
            Connection connection = Database.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            for (int i = 0; i < values.length; i++) {
                statement.setObject(i + 1, values[i]);
            }
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                user = map(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * Returns a list of all users from the database ordered by user ID. The
     * list is never null and is empty when the database does not contain any
     * user.
     *
     * @return A list of all users from the database ordered by user ID. If
     * something fails at database level.
     */
    public ArrayList<User> findAll() throws Exception {
        ArrayList<User> users = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_LIST_ORDER_BY_EMAIL);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
//                System.out.println(rs);
                users.add(map(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    /**
     * Create the given user in the database. The user ID must be null,
     * otherwise it will throw IllegalArgumentException. After creating, the DAO
     * will set the DateTimeRegistered in the given user.
     *
     * @param user The user to be created in the database.
     *
     * If something fails at database level.
     */
    public void create(User user) throws Exception {
        if (user.getDateTimeRegistered() != null) {
            System.out.println("This user has already registered.");
        } else {
            Object[] values = {
                user.getEmailAddress(),
                user.getPassword(),
                user.getFirstName(),
                user.getLastName(),
                user.getBirthday(),
                new Timestamp(new java.util.Date().getTime()),
                null,
                user.getGender(),
                user.getRole(),
                user.getBio()
            };

            try {
                Connection con = Database.getConnection();
                PreparedStatement stmt = con.prepareStatement(SQL_INSERT);

                for (int i = 0; i < values.length; i++) {
                    System.out.println(values[i]);
                    stmt.setObject(i + 1, values[i]);
                }
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Update the given user in the database. The user ID must not be null,
     * otherwise it will throw IllegalArgumentException. Note: the password will
     * NOT be updated. Use changePassword() instead.
     *
     * @param user The user to be updated in the database.
     *
     * If something fails at database level.
     */
    public void update(User user) throws Exception {
        Object[] values = {
            user.getEmailAddress(),
            user.getPassword(),
            user.getFirstName(),
            user.getLastName(),
            user.getBirthday(),
            user.getDateTimeRegistered(),
            user.getLastLoggedIn(),
            user.getGender(),
            user.getRole(),
            user.getBio(),
            user.getEmailAddress()
        };
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_UPDATE);

            for (int i = 0; i < values.length; i++) {
//                if (values[i] == null) {
//                    if (values[i] instanceof Timestamp)
//                        stmt.setNull(i + 1, Types.TIMESTAMP);
//                    else if (values[i] instanceof String)
//                        stmt.setNull(i + 1, Types.VARCHAR);
//                } else
//                System.out.println("Bla" + values[i]);
                stmt.setObject(i + 1, values[i]);
            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete the given user from the database. After deleting, the DAO will set
     * the DateTimeRegistered of the given user to null.
     *
     * @param user The user to be deleted from the database. If something fails
     * at database level.
     */
    public void delete(User user) throws Exception {
        Object[] values = {
            user.getEmailAddress()
        };
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_DELETE);

            for (int i = 0; i < values.length; i++) {
                stmt.setObject(i + 1, values[i]);
            }
            stmt.executeUpdate();
            user.setDateTimeRegistered(null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns true if the given email address exist in the database.
     *
     * @param email The email address which is to be checked in the database.
     * @return True if the given email address exist in the database. If
     * something fails at database level.
     */
    public boolean existEmail(String email) throws Exception {
        boolean exist = false;
        Object[] values = {
            email
        };
        try {
            Connection con = Database.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_EXIST_EMAIL);

            for (int i = 0; i < values.length; i++) {
                stmt.setObject(i + 1, values[i]);
            }
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                exist = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exist;
    }

    private static User map(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setEmailAddress(resultSet.getString("EmailAddress"));
        user.setPassword(resultSet.getString("Password"));
        user.setFirstName(resultSet.getString("FirstName"));
        user.setLastName(resultSet.getString("LastName"));
        user.setGender(resultSet.getString("Gender"));
        user.setBirthday(resultSet.getDate("Birthday"));
        user.setDateTimeRegistered(resultSet.getTimestamp("DateRegistered"));
        user.setLastLoggedIn(resultSet.getTimestamp("LastLoggedIn"));
        return user;
    }
}
