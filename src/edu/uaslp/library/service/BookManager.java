package edu.uaslp.library.service;

import edu.uaslp.library.model.Book;
import edu.uaslp.library.model.User;

import java.util.HashMap;

public class BookManager {

    private HashMap<String, Book> libros = new HashMap<>();

    private Book createBook(String isbn, String tittle) {
        Book libro = new Book();

        libro.setIsbn(isbn);
        libro.setTitle(tittle);

        return libro;
    }

    public BookManager() {
        libros.put("345", createBook("345", "El Principito"));
        libros.put("456", createBook("456", "Donde habitan los angeles"));
        libros.put("567", createBook("567", "HP y la piedra filosofal"));
        libros.put("678", createBook("678", "HP y la camara de los secretos"));
        libros.put("789", createBook("789", "HP y el prisionero de Azkaban"));
        libros.put("123", createBook("123", "HP y el caliz de fuego"));
        libros.put("234", createBook("234", "HP y el principe mestizo"));
        libros.put("141", createBook("141", "HP y las reliquias de la muerte 1"));
        libros.put("225", createBook("225", "Lobo estepario"));
        libros.put("261", createBook("261", "Viaje al centro de la Tierra"));
    }


    public Book dameLibroPorClave(String isbn) {

        return libros.get(isbn);
    }
}
