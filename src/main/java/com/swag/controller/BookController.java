package com.swag.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swag.model.Book;
import com.swag.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/save")
	public String savebook(@RequestBody Book book)
	{
		return bookService.savebook(book);
		
	}
	@GetMapping("/fetch/{id}")
	public Optional<Book> getbook(@PathVariable int id)
	{
		return bookService.getbook(id);
		
	}
	@DeleteMapping("/delete/{id}")
	public List<Book> deletebook(@RequestParam int id)
	{
		return bookService.deletebook(id);
		
	}
}
