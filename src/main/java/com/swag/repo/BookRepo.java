package com.swag.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.swag.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
