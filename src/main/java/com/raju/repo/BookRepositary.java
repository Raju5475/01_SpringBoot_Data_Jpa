package com.raju.repo;

import org.springframework.data.repository.CrudRepository;

import com.raju.it.Book;

public interface BookRepositary extends CrudRepository<Book, Integer>{
	

}
