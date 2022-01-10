package com.swag.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swag.model.Book;
import com.swag.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	public String savebook(Book book) {
	 bookRepo.save(book);
	return "Book save with id "+ book.getId();	
	}
	
	public Optional<Book> getbook(int id)
	{
		return bookRepo.findById(id);
	}
	
	public List<Book> deletebook(int id)
	{
		bookRepo.deleteById(id);
		return bookRepo.findAll();
		
	}
	
}
