package org.dimigo.oop;

public class Book {
	   
	   private String title = "미생";
	   private String author = "윤태호";
	   private int page = 1000;
	   
	   //생성자 추가
	   public Book() {
	      System.out.println("기본생성자");
	   }
	   
	   //필요한 경우 다양한 생성자 만들기 가능
	   public Book(String title, String author, int page) {
	      this.title = title;
	      this.author = author;
	      this.page = page;
	   }
	   
	   public Book(String title, String author) {
	      this.title = title;
	      this.author = author;
	   }
	   
	   public Book(String title) {
		      this.title = title;
//		      this.author = author;
	   }
	   
	   //getter 메소드    
	   public String getTitle() {
	      return title;
	   }
	   public String getAuthor() {
	      return author;
	   }
	   public int getPage() {
	      return page;
	   }
	   
	   //setter 메소드
	   public void setTitle(String newtitle) {
	      title = newtitle;
	   }
	   
	   public void setAuthor(String newAuthor) {
	      author = newAuthor;
	   }
	   
	   public void setPage(int newPage) {
	      if (newPage >= 1) page = newPage;
	   }
	   
	   public String toString(){
		   return "책제목: " + title + ", 저자명: "+ author + ", 페이지수: " + page;
	   }
	}