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
public class Article {
    private int ArticleID;
    private String Category;
    private String Title;
    private String Content;
    private int Views;
    private String ArticleURL;
    private String ImageURL;
    private String DateTimePublished;
    private String DateTimeUpdated;
    
    
    public Article(){
        //
    } 
    
    
        public int getArticleID() {
		return ArticleID;
	}
	public void setArticleID(int articleID) {
		ArticleID = articleID;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getViews() {
		return Views;
	}
	public void setViews(int views) {
		Views = views;
	}
	public String getArticleURL() {
		return ArticleURL;
	}
	public void setArticleURL(String articleURL) {
		ArticleURL = articleURL;
	}
	public String getImageURL() {
		return ImageURL;
	}
	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}
	public String getDateTimePublished() {
		return DateTimePublished;
	}
	public void setDateTimePublished(String dateTimePublished) {
		DateTimePublished = dateTimePublished;
	}
	public String getDateTimeUpdated() {
		return DateTimeUpdated;
	}
	public void setDateTimeUpdated(String dateTimeUpdated) {
		DateTimeUpdated = dateTimeUpdated;
	}
    
}
