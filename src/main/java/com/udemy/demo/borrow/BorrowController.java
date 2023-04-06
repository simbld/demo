package com.udemy.demo.borrow;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class BorrowController {
    @GetMapping(value = "/borrows")
    public ResponseEntity getMyBorrows() {
        Borrow borrow = new Borrow();
        borrow.setAskDate(LocalDate.now());
        return new ResponseEntity(borrow, HttpStatus.OK);
    }
}
