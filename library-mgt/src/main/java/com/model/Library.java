package com.model;

import javax.persistence.Entity;

@Entity
public class Library {
	private int id;
	private String bookName;
	private String authorName;
	private int bookPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString()
	{
		return "subject [id=" +id+ ", bookName="+bookName+ ", authorName="+authorName+ ", bookPrice="+bookPrice+ "]";
	}

}
