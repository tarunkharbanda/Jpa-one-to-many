package com.swag.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="swaggerapis")
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -33844637951762906L;
	@Id
	@GeneratedValue
	private int id;
	private String bookname;
	private String bookprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookprice() {
		return bookprice;
	}
	public void setBookprice(String bookprice) {
		this.bookprice = bookprice;
	}
	public Book(int id, String bookname, String bookprice) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookModel [id=" + id + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	

}
