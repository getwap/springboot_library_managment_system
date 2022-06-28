package com.lms.librarymanagment.controller;

import com.lms.librarymanagment.domain.Book;
import com.lms.librarymanagment.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v5")


public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public Book saveBook(@RequestBody Book book){
        System.out.println("congrats!!! you have saved your first data :)");
        return bookService.saveBook(book);
    }
    @GetMapping("/book")
    public List<Book> getBook(){
        return bookService.getBook();
    }
    @GetMapping("/book/{id}")
    public Book getSingleBook(@PathVariable Long id){
        return bookService.singleBook(id);
    }
    @DeleteMapping("/book/{id}")
    public void deleteBook (@PathVariable Long id){
        bookService.deleteBook(id);
    }
    @PutMapping("/book/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id){
//        book.setId(id);
//        book.setAuthor("unknown");
        return bookService.updateBook(book);}
}
