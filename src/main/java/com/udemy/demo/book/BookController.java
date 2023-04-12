package com.udemy.demo.book;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@Validated // @Validated is used to validate the request body of the POST and PUT methods
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<Book>> listBooks() {
        Book book1 = new Book();
        book1.setTitle("MyBook1");
        book1.setCategory(new Category("BD"));

        Book book2 = new Book();
        book2.setTitle("MyBook2");
        book2.setCategory(new Category("Roman"));

        Book book3 = new Book();
        book3.setTitle("MyBook3");
        book3.setCategory(new Category("Science"));

        return new ResponseEntity<>(Arrays.asList(book1, book2, book3), HttpStatus.OK);
    }
    @PostMapping("/books")
    public ResponseEntity addBook(@Valid @RequestBody Book book) {
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/books/{bookId}")
    public  ResponseEntity deleteBook(@PathVariable("bookId") String bookId) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/books/{bookId}")
    public  ResponseEntity updateBook(@PathVariable("bookId") String bookId,
                                      @Valid
                                      @RequestBody Book book) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/categories")
    public ResponseEntity listCategories() {
        Category categoryBd = new Category("BD");
        Category categoryRoman = new Category("Roman");
        Category categoryScience = new Category("Science");

        return new ResponseEntity<>(Arrays.asList(categoryBd, categoryRoman, categoryScience), HttpStatus.OK);
    }
}
