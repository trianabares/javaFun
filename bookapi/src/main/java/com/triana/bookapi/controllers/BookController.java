package com.triana.bookapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
		
		// todos los libros
	    @GetMapping("/books")
	    public String index(Model model) {
	        List<BookModel> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "/books/index.jsp";
	    }
	    
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
	    
}
