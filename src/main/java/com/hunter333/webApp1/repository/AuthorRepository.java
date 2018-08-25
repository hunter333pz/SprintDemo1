package com.hunter333.webApp1.repository;

import org.springframework.data.repository.CrudRepository;

import com.hunter333.webApp1.model.Author;

/**
 * 
 * @author Hunter333
 *
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
