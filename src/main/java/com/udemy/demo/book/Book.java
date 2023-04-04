package com.udemy.demo.book;

public class Book { // @Entity (une entité JPA) + @Table (une table SQL) + @Id (une clé primaire) + @GeneratedValue (généré automatiquement) + @Column (une colonne SQL) + @ManyToOne (une relation de type ManyToOne) + @JoinColumn (une clé étrangère) + @OneToMany (une relation de type OneToMany) + @ManyToMany (une relation de type ManyToMany) + @JoinTable (une table de jointure) + @Transient (une propriété non persistée)
    private String title; // Déclaration d'une propriété "title" de type String // @Column (une colonne SQL) + @Id (une clé primaire) + @GeneratedValue (généré automatiquement) + @Transient (une propriété non persistée)
    private Category category; // Déclaration d'une propriété "category" de type Category // @ManyToOne (une relation de type ManyToOne) + @JoinColumn (une clé étrangère) + @Transient (une propriété non persistée) + @OneToMany (une relation de type OneToMany) + @ManyToMany (une relation de type ManyToMany) + @JoinTable (une table de jointure)

    public Book() { // Constructeur par défaut (sans arguments) // @Entity (une entité JPA) + @Table (une table SQL) + @Id (une clé primaire) + @GeneratedValue (généré automatiquement) + @Column (une colonne SQL) + @ManyToOne (une relation de type ManyToOne) + @JoinColumn (une clé étrangère) + @OneToMany (une relation de type OneToMany) + @ManyToMany (une relation de type ManyToMany) + @JoinTable (une table de jointure) + @Transient (une propriété non persistée)
    }

    public Book(String title, Category category) { // Constructeur avec arguments // @Entity (une entité JPA) + @Table (une table SQL) + @Id (une clé primaire) + @GeneratedValue (généré automatiquement) + @Column (une colonne SQL) + @ManyToOne (une relation de type ManyToOne) + @JoinColumn (une clé étrangère) + @OneToMany (une relation de type OneToMany) + @ManyToMany (une relation de type ManyToMany) + @JoinTable (une table de jointure) + @Transient (une propriété non persistée)
        this.title = title; // Initialisation de la propriété "title" avec la valeur passée en argument // @Column (une colonne SQL) + @Id (une clé primaire) + @GeneratedValue (généré automatiquement) + @Transient (une propriété non persistée)
        this.category = category; // Initialisation de la propriété "category" avec la valeur passée en argument // @ManyToOne (une relation de type ManyToOne) + @JoinColumn (une clé étrangère) + @Transient (une propriété non persistée) + @OneToMany (une relation de type OneToMany) + @ManyToMany (une relation de type ManyToMany) + @JoinTable (une table de jointure)
    }

    public String getTitle() {
        return title;
    } // Déclaration d'une méthode "getTitle" qui retourne une valeur de type String // @Column (une colonne SQL) + @Id (une clé primaire) + @GeneratedValue (généré automatiquement) + @Transient (une propriété non persistée)

    public void setTitle(String title) { // Méthode "setter" pour définir la valeur de la propriété "title"
        this.title = title;
    } // Déclaration d'une méthode "setTitle" qui prend en argument une valeur de type String // @Column (une colonne SQL) + @Id (une clé primaire) + @GeneratedValue (généré automatiquement) + @Transient (une propriété non persistée)

    public Category getCategory() {// Méthode "getter" pour récupérer la valeur de la propriété "category"
        return category;
    } // Déclaration d'une méthode "getCategory" qui retourne une valeur de type Category // @ManyToOne (une relation de type ManyToOne) + @JoinColumn (une clé étrangère) + @Transient (une propriété non persistée) + @OneToMany (une relation de type OneToMany) + @ManyToMany (une relation de type ManyToMany) + @JoinTable (une table de jointure)

    public void setCategory(Category category) { // Méthode "setter" pour définir la valeur de la propriété "category"
        this.category = category;
    } // Déclaration d'une méthode "setCategory" qui prend en argument une valeur de type Category // @ManyToOne (une relation de type ManyToOne) + @JoinColumn (une clé étrangère) + @Transient (une propriété non persistée) + @OneToMany (une relation de type OneToMany) + @ManyToMany (une relation de type ManyToMany) + @JoinTable (une table de jointure)
}
