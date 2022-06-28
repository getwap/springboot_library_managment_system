package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.Book;
import com.lms.librarymanagment.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{


    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> getBook (){
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);

    }

    @Override
    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public Book singleBook(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            return bookRepository.getReferenceById(id);
        }
        throw new RuntimeException("can't locate book" + id);
    }
}
