package com.practice.book.controller;

import com.practice.book.model.Book;
import com.practice.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/book")

public class BookController {

    @Autowired

    private BookService bookService;
    @PostMapping("/new book")
    public Book addBook(@RequestBody Book book){
        return this.bookService.addNewBook(book);
    }
    @GetMapping("/all")
    public List<Book> getAll(){
        return this.bookService.getAllBooks();
    }


    @DeleteMapping("/delete/{id}")

    public String deleteBook(@PathVariable Integer id){
        return this.bookService.deleteBook(id);
    }
    @GetMapping({"/myid"})
    public Optional<Book> getSingleBook(@PathVariable Integer myid){
        return this.bookService.getSingleBook(myid);
    }
    @PutMapping("/update/{id}")
    public Book updateBookDetails(@PathVariable Integer id,@RequestBody Book latestBook){
        return this.bookService.updateBookDetails(id,latestBook);
    }

    @PatchMapping("/specific/{id}")
    public Book updateSpecificData(@PathVariable Integer id, @RequestParam Integer bookPrice){
        return this.bookService.updateSpecificData(id, bookPrice);
    }
}
