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
public class Reaction {
    
    private int ReactionID;
    private int ArticleID;
    private int SessionID;
    private String Reaction;

    

    public int getArticleID(){
        return ArticleID;
    }
    public void setArticleID(int ArticleID){
        this.ArticleID = ArticleID;
    }
    
    public String getReaction(){
        return Reaction;
    }
    public void setReaction(String Reaction){
        this.Reaction = Reaction;
    }
    
    public int getReactionID() {
        return ReactionID;
    }
    
    public void setReactionID(int ReactionID) {
        this.Reaction = Reaction;
    }
}
