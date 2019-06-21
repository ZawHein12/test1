package com.library.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Book_Rent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "book_id")
	public int book_id;
	public Book_Rent(int id, int book_id, int student_id, int qty) {
		super();
		this.id = id;
		this.book_id = book_id;
		this.student_id = student_id;
		this.qty = qty;
	}
	@Column(name = "Student_id")
	public int student_id;
	@Column(name="qty")
	public int qty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	}


