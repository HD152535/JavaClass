package org.dimigo.oop;

public class Book2 {
	
	private String title;
	private String author;
	private int page;
	
	// 오른쪽 버튼 > source > generate Constructor using Fields
	public Book2(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	
	// 오른쪽 버튼 > source > generate Getters and Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
	
}
