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
public class Reactions {
    
    private int reaction;
    private int articleID;
    private String IPAddress;
    
    
    public Reactions(){
        //
    }
    
    
    public String getIPAddress(){
        return IPAddress;
    }
    public void setIPAddress(){
        this.IPAddress = IPAddress;
    }
    
    public int getArticleID(){
        return articleID;
    }
    public void setArticleID(int articleID){
        this.articleID = articleID;
    }
    
    public int getReaction(){
        return reaction;
    }
    public void setReaction(int reaction){
        this.reaction = reaction;
    }
    
    public void checkReaction(){
        //happy? sad? idk lol
    }
}
