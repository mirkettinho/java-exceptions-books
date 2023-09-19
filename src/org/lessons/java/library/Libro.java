package org.lessons.java.library;

public class Libro {
	
	private String title;
	private int numberOfPages;
	private String author;
	private String publisher;
	
	public Libro(String title, int numberOfPages, String author, String publisher) throws Exception {
		
		setTitle(title);
		setNumberOfPages(numberOfPages);
		setAuthor(author);
		setPublisher(publisher);
		
	}
	
	///TITLE
	public String getTitle() {
		
		return title;
	}
	
	public void setTitle(String title) throws Exception {
		
		if(title.isBlank()) throw new Exception("The title can't be empty");
		this.title = title;
	}
	
	///NUMBER OF PAGES
	public int getNumberOfPages() {
		
		return numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages) throws Exception {
		
		if(numberOfPages <= 0) throw new Exception("Page number can't be 0 or less");
		this.numberOfPages = numberOfPages;
	}
	
	///AUTHOR
	public String getAuthor() {
		
		return author;
	}
	
	public void setAuthor(String author) throws Exception {
		
		if(author.isBlank()) throw new Exception("The author can't be empty");
		this.author = author;
	}
	
	///PUBLISHER
	public String getPublisher() {
		
		return publisher;
	}
	
	public void setPublisher(String publisher) throws Exception {
		
		if(publisher.isBlank()) throw new Exception("The publisher can't be empty");
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		
		return "Title: " + getTitle() + " | " +
				"Page number: " + getNumberOfPages() + " | " +
				"Author: " + getAuthor() + " | " +
				"Publisher: " + getPublisher() + " | " ;
	}
}
