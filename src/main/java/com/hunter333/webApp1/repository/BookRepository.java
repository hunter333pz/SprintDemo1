package com.hunter333.webApp1.repository;

import org.springframework.data.repository.CrudRepository;

import com.hunter333.webApp1.model.Book;

/**
 * 
 * @author Hunter333
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
