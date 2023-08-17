package com.triana.bookapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.triana.bookapi.models.BookModel;
import com.triana.bookapi.services.BookService;

@RestController
public class BookApiControllers {
	
	//inyeccion de dependencias
//	  private final BookService bookService;
	  // constructor
//	    public BookApiControllers(BookService bookService){
//	        this.bookService = bookService;
//	    } Equivale a el Autowired
	    
	    @Autowired
	    private BookService bookService;
	    
	    // mostrar info de todos los libros
	    @GetMapping("/api/books")
	    public List<BookModel> index() {
	        return bookService.allBooks();
	    }
	    
	    // crea un libro
	    @PostMapping("/api/books")
	    public BookModel create(@RequestParam(value="title") String title,
	    		@RequestParam(value="description") String desc, 
	    		@RequestParam(value="language") String lang, 
	    		@RequestParam(value="pages") Integer numOfPages) {
	        BookModel book = new BookModel(title, desc, lang, numOfPages);
	        return bookService.createBook(book);
	    }
	    
	    // Mostrar info de un libro especifico
	    @GetMapping("/api/books/{id}")
	    public BookModel show(@PathVariable("id") Long id) {
	        BookModel book = bookService.findBook(id);
	        return book;
	    }
	    
	    //Actualizar info de un libro específico
	    @PutMapping("/api/books/{id}")
	    public BookModel actualizar(@PathVariable("id") Long id, 
	    		@RequestParam(value="title") String title,
	    		@RequestParam(value="description") String desc, 
	    		@RequestParam(value="language") String lang, 
	    		@RequestParam(value="pages") Integer numOfPages) {
	    	BookModel book = new BookModel(id, title, desc, lang, numOfPages);
	    	return bookService.actualizarLibro(book);
	    }
	    
	    // Borrar libro
	    @DeleteMapping("/api/books/{id}")
	    public void borrarLibro(@PathVariable("id") Long id) {
	    	bookService.borrarLibro(id);
	    }


}
