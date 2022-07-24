package com.kapsky.simplewebapp.repositories;

import com.kapsky.simplewebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
