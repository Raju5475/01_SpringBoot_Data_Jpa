package com.raju.it;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Book1")
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private Double bookPrice;

}
