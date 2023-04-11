package com.udemy.demo.book;

import jakarta.validation.constraints.NotBlank;

public class Book {

    @NotBlank
    private String title; // Déclaration d'une propriété "title" de type String // @Column (une colonne SQL) + @Id (une clé primaire) + @GeneratedValue (généré automatiquement) + @Transient (une propriété non persistée)
    private Category category; // Déclaration d'une propriété "category" de type Category // @ManyToOne (une relation de type ManyToOne) + @JoinColumn (une clé étrangère) + @Transient (une propriété non persistée) + @OneToMany (une relation de type OneToMany) + @ManyToMany (une relation de type ManyToMany) + @JoinTable (une table de jointure)
    private BookStatus bookStatus;

    public Book() {
    }

    public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public Category getCategory () {
            return category;
        }

        public void setCategory (Category category){
            this.category = category;
        }

        public BookStatus getBookStatus () {
            return bookStatus;
        }

        public void setBookStatus (BookStatus bookStatus){
            this.bookStatus = bookStatus;
        }
    }
