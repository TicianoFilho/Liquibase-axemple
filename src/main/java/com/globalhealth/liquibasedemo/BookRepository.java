package com.globalhealth.liquibasedemo;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
