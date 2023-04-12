package com.udemy.demo.borrow;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
@Validated
public class BorrowController {

    @GetMapping("/borrows")
    public ResponseEntity getMyBorrows() {

        Borrow borrow = new Borrow();
        borrow.setAskDate(LocalDate.now());
        return new ResponseEntity<>(borrow, HttpStatus.OK);
    }

    @PostMapping( "/borrows/{bookId}")
    public ResponseEntity createBorrow(@Valid @PathVariable("bookId") String bookId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/borrows/{borrowId}")
    public ResponseEntity deleteBorrow(@PathVariable("borrowId") String borrowId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
