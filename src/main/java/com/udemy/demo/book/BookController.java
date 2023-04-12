package com.udemy.demo.book; // Déclaration du package contenant la classe


import org.springframework.http.HttpStatus; // Importation de la classe HttpStatus du package org.springframework.http
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Creation des web services avec Spring MVC
@RestController // permet de déclarer un bind Spring qui gère les requêtes HTTP et renvoie des réponses HTTP et qui permet de l'exposer au monde extérieur
public class BookController { // Creation du endpoint "/books" qui permet d'afficher les livres disponibles

    @GetMapping(value = "/books") // est une annotation Spring qui est utilisée pour mapper la méthode listBooks() à l'URL "/books". Cela signifie que lorsque l'application reçoit une requête HTTP GET à cette URL,
    // la méthode listBooks() sera exécutée et renverra une réponse HTTP contenant les informations demandées. // @RequestMapping(value="/books", method=RequestMethod.GET) + @ResponseBody (la valeur de retour est sérialisée en JSON)
    public ResponseEntity<List<Book>> listBooks() {  /* méthode "listBooks" qui est définie dans la classe "BookController" utilise l'annotation "@GetMapping" qui indique que cette méthode répond à une requête HTTP GET sur le chemin "/books"
    et utilise le générique <> pour spécifier le type de données qu'on veut renvoyer (la valeur de retour est sérialisée en JSON) + @RequestBody (le corps de la requête est désérialisé en objet Java) */
        Book book1 = new Book(); // Créer le premier livre // @RequestBody  (le corps de la requête est désérialisé en objet Java)
        book1.setTitle("MyBook1"); // Définir le titre du premier livre
        book1.setCategory(new Category("BD")); // Définir la catégorie du premier livre

        Book book2 = new Book();
        book2.setTitle("MyBook2");
        book2.setCategory(new Category("Roman"));

        Book book3 = new Book();
        book3.setTitle("MyBook3");
        book3.setCategory(new Category("Science"));

        return new ResponseEntity<>(Arrays.asList(book1, book2, book3), HttpStatus.OK); /* La méthode java Arrays.asList retourne a Spring MVC un new objet de type "ResponseEntity" dans lequel on va stocker la liste de livres et
        qui permet de retourner une réponse HTTP personnalisée avec un code de statut et des en-têtes HTTP.
        la méthode retourne une liste de livres encapsulée dans un objet new "ResponseEntity" // la méthode retourne un code d'état HTTP "200 OK" */
    }
    @PostMapping(value = "/books") /* est une annotation Spring qui est utilisée pour mapper la méthode addBook() à l'URL "/books". Cela signifie que lorsque l'application reçoit une requête HTTP POST à cette URL,
    la méthode addBook() sera exécutée et renverra une réponse HTTP contenant les informations demandées. */
    public ResponseEntity addBook(@RequestBody Book book) {
        return new ResponseEntity(book, HttpStatus.CREATED); // la méthode retourne un code d'état HTTP "201 CREATED"
    }

    @DeleteMapping(value = "/books/{bookId}")
    public  ResponseEntity deleteBook(@PathVariable("bookId") String bookId) { // @PathVariable (@RequestParam) va bind l'Id dans l'url bookId dans la variable bookId
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/books/{bookId}")
    public  ResponseEntity updateBook(@PathVariable("bookId") String bookId,
                                      @Validated
                                      @RequestBody Book book) { // @PathVariable (@RequestParam) va bind l'Id dans l'url bookId dans la variable bookId
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/categories")
    public ResponseEntity listCategories() {
        Category categoryBd = new Category("BD");
        Category categoryRoman = new Category("Roman");
        Category categoryScience = new Category("Science");

        return new ResponseEntity(Arrays.asList(categoryBd, categoryRoman, categoryScience), HttpStatus.OK);
    }
}
