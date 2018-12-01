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
public class Comments {
    
    public String comment;
    public String commenterEmail;
    public String commentDateTime;
    
    
    public Comments(){
        //
    }
    
    public String getCommenterEmail(){
        return commenterEmail;
    }
    public void setCommentDateTime(String commentDateTime){
        this.commentDateTime = commentDateTime;
    }
    
    public String getCommentDateTime(){
        return commentDateTime;
    }
    public void setCommenterEmail(String commenterEmail){
        this.commenterEmail = commenterEmail;
    }
    
    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    
    
    
}
