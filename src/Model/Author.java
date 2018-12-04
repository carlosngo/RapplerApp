/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Miggy
 */
public class Author {
    private int AuthorID;
    private int AuthorEmail;
    
    
    public Author(){
        //
    }
    
    
    public int getAuthorID() {
	return AuthorID;
    }
    public void setAuthorID(int authorID) {
	AuthorID = authorID;
    }
    public int getAuthorEmail() {
	return AuthorEmail;
    }
    public void setAuthorEmail(int authorEmail) {
	AuthorEmail = authorEmail;
    }
    
}
