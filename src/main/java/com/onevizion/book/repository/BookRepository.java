package com.onevizion.book.repository;

import com.onevizion.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value = "select * from book order by title desc", nativeQuery = true)
    List<Book> findAllByDescTitle();

    @Query(value = "select * from book where author=:name", nativeQuery = true)
    List<Book> findAllByAuthor(@Param("name") String name);
}
