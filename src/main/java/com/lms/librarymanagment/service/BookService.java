package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService   {
    List<Book> getBook ();
    Book saveBook(Book book);
    Book singleBook(Long id);


    void deleteBook(Long id);

    Book updateBook(Book Long);


}
