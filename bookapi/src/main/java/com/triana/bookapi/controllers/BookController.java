package com.triana.bookapi.controllers;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.triana.bookapi.models.BookModel;
import com.triana.bookapi.services.BookService;

import jakarta.validation.Valid;

@Controller
public class BookController {

//		private final BookService bookService;
//	    
//	    public BooksController(BookService bookService) {
//	        this.bookService = bookService;
//	    }
	
		@Autowired
		private BookService bookService;
		
		@GetMapping("/")
	    public String redirect() {
	        return "redirect:/books";
	    }
		
		//TODOS LOS LIBROS
	    @GetMapping("/books")
	    public String index(Model model) {
	        List<BookModel> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "/books/index.jsp";
	    }
	    
	    //NUEVO LIBRO
	    @GetMapping("/books/new")
	    public String nuevoLibro(@ModelAttribute("libro") BookModel book) {
	    	return "/books/nuevolibro.jsp";
	    }
	    
	    @PostMapping("/books")
	    public String crearLibro(@Valid @ModelAttribute("libro") BookModel book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/books/nuevolibro.jsp";
	        } else {
	            bookService.createBook(book);
	            return "redirect:/books";
	        }
	    }
	    
	    //MOSTRAR INFO DE UN LIBRO ESPECIFICO
	    @GetMapping("/books/{id}")
	    public String mostrarLibro(@PathVariable("id") Long id, BookModel book, Model model) {
	    	BookModel booke = bookService.findBook(id);
	    	model.addAttribute("book", booke);
	        return "/books/show.jsp";
	    }
	    
	    //ELIMINAR LIBRO
	    @DeleteMapping("/books/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	        bookService.borrarLibro(id);
	        return "redirect:/books";
	    }
	    
	    //EDITAR LIBRO
	    @GetMapping("/books/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model) {
	        BookModel book = bookService.findBook(id);
	        model.addAttribute("libro", book);
	        return "/books/edit.jsp";
	    }
	    
	    @PutMapping("/books/{id}")
	    public String update(@Valid @ModelAttribute("libro") BookModel book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/books/edit.jsp";
	        } else {
	            bookService.actualizarLibro(book);
	            return "redirect:/books";
	        }
	    }
	    
}
