package com.udemy.demo.book;

import jdk.jfr.Category;

public class Book {
    private String title;
    private Category category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Book(String title, Category category) {
        this.title = title;
        this.category = category;
    }
}
