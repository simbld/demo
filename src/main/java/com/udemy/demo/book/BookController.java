package com.udemy.demo.book; // Déclaration du package contenant la classe

import org.springframework.http.HttpStatus; // Importation de la classe HttpStatus du package org.springframework.http
import org.springframework.http.ResponseEntity; // Importation de la classe ResponseEntity du package org.springframework.http
import org.springframework.web.bind.annotation.GetMapping; // Importation de la classe GetMapping du package org.springframework.web.bind.annotation
import org.springframework.web.bind.annotation.RestController; // Importation de la classe RestController du package org.springframework.web.bind.annotation

import java.util.Arrays; // Importation de la classe Arrays du package java.util

@RestController // permet de déclarer un bean Spring qui gère les requêtes HTTP et renvoie des réponses HTTP et qui permet de l'exposer au monde extérieur
public class BookController { // Creation du endpoint "/books" qui permet d'afficher les livres disponibles

    @GetMapping(value="/books") // est une annotation Spring qui est utilisée pour mapper la méthode listBooks() à l'URL "/books". Cela signifie que lorsque l'application reçoit une requête HTTP GET à cette URL,
    // la méthode listBooks() sera exécutée et renverra une réponse HTTP contenant les informations demandées. // @RequestMapping(value="/books", method=RequestMethod.GET) + @ResponseBody (la valeur de retour est sérialisée en JSON)
    public ResponseEntity listBooks() { // méthode "listBooks" qui est définie dans la classe "BookController" utilise l'annotation "@GetMapping" qui indique que cette méthode répond à une requête HTTP GET sur le chemin "/books"
        // (la valeur de retour est sérialisée en JSON) + @RequestBody (le corps de la requête est désérialisé en objet Java)
        Book book1 = new Book(); // Créer le premier livre // @RequestBody  (le corps de la requête est désérialisé en objet Java)
        book1.setTitle("MyBook1"); // Définir le titre du premier livre
        book1.setCategory(new Category("BD")); // Définir la catégorie du premier livre

        Book book2 = new Book();
        book2.setTitle("MyBook2");
        book2.setCategory(new Category("Roman"));

        Book book3 = new Book();
        book3.setTitle("MyBook3");
        book3.setCategory(new Category("Science"));

        return new ResponseEntity(Arrays.asList(book1, book2, book3), HttpStatus.OK); /* La méthode java Arrays.asList retourne a Spring MVC un new objet de type "ResponseEntity" dans lequel on va stocker la liste de livres et
        qui permet de retourner une réponse HTTP personnalisée avec un code de statut et des en-têtes HTTP.
        la méthode retourne une liste de livres encapsulée dans un objet new "ResponseEntity", avec un code d'état HTTP "200 OK"
        @ResponseBody  (la valeur de retour est sérialisée en JSON) + @RequestBody (le corps de la requête est désérialisé en objet Java)*/
    }
}
