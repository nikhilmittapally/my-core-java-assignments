package com.practice.book.service;

import com.practice.book.model.Book;
import com.practice.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookService {

    @Autowired
    private BookRepository bookRepository;

    //add book
    public Book addNewBook(Book book){
        this.bookRepository.save(book);
        return book;
    }
    public List<Book> getAllBooks(){
        return this.bookRepository.findAll();
    }
    public String deleteBook(Integer selectedBookId){
     this.bookRepository.deleteById(selectedBookId);
     return "deleted" +selectedBookId +"Book deleted successful";
    }

    public Optional<Book> getSingleBook(Integer bookId){
        return this.bookRepository.findById(bookId);
    }
    public Book updateBookDetails(Integer id, Book updatedBook){
        Book oldbook=this.bookRepository.findById(id).get();
        oldbook.setBookPrice(updatedBook.getBookPrice());
        oldbook.setBookName(updatedBook.getBookName());
        oldbook.setBookAuthor(updatedBook.getBookAuthor());

        this.bookRepository.save(oldbook);
        return updatedBook;
    }
    public Book updateSpecificData(Integer id, Integer bookPrice) {
        Book oldBook = bookRepository.findById(id).get();

        oldBook.setBookPrice(bookPrice);
        this.bookRepository.save(oldBook);

        return oldBook;
    }
    }




