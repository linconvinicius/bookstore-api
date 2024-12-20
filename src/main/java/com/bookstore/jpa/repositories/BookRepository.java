package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {

       BookModel findBookModelByTitle(String title);

       List<BookModel> findAllByPublisherId(UUID id);
}
