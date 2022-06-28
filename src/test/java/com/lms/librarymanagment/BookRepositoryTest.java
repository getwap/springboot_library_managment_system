package com.lms.librarymanagment;


import com.lms.librarymanagment.domain.Book;
import com.lms.librarymanagment.repository.BookRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void saveBooksTest (){
        Book book1 = Book.builder()
            .ISBn("12A")
            .author("unknown")
            .callNo("A-1289")
            .copyNum(Long.valueOf(10))
            .edition("new")
            .publisher("jafar books")
            .title("the unknown")
            .build();

        bookRepository.save(book1);

        Assertions.assertThat(book1.getId()).isGreaterThan(1);

    }
    @Test
    public void getBookTest(){
        Book book = bookRepository.findById(Long.valueOf(1)).get();
        Assertions.assertThat(book.getId()).isEqualTo(1L);
    }

    @Test
    public void getListofBooksTest(){
        List<Book> book = bookRepository.findAll();
        Assertions.assertThat(book.size()).isGreaterThan(0);
    }

    @Test
    public void updateBookTest(){

        Book book = bookRepository.findById(1L).get();
        book.setPublisher("Mega Books Co Ltd");
        Book bookPublisherUpdated = bookRepository.save(book);
        Assertions.assertThat(bookPublisherUpdated.getPublisher()).isEqualTo("Mega Books Co Ltd");

    }

    @Test
    public void deleteBookTest(){
    Book book = bookRepository.findById(1L).get();

    bookRepository.delete(book);
    Book book1 = null;

        Optional<Book> optionalBook = bookRepository.findById(1L);

        if (optionalBook.isPresent()){
            book1 = optionalBook.get();
        }

        Assertions.assertThat(book1).isNull();

    }




}
