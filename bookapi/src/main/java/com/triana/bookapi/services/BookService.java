package com.triana.bookapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triana.bookapi.models.BookModel;
import com.triana.bookapi.repositories.BookRepo;

@Service
public class BookService {
	//Agregando el book al repositorio como una dependencia
//    private final BookRepo bookRepository;
 //   
 //   public BookService(BookRepository bookRepository) {
  //      this.bookRepository = bookRepository;
  //  }
    
    @Autowired
    private BookRepo bookRepository;
    
    //Devolviendo todos los libros.
    public List<BookModel> allBooks() {
        return bookRepository.findAll();
    }
    //Creando un libro.
    public BookModel createBook(BookModel b) {
        return bookRepository.save(b);
    }
    //Obteniendo la información de un libro
    public BookModel findBook(Long id) {
        Optional<BookModel> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // Actualizar información
    public BookModel actualizarLibro(BookModel libro) {
    	BookModel libroTemporal = findBook(libro.getId());
    	libroTemporal.setDescription(libro.getDescription());
    	libroTemporal.setTitle(libro.getTitle());
    	libroTemporal.setNumberOfPages(libro.getNumberOfPages());
    	libroTemporal.setLanguage(libro.getLanguage());
    	return bookRepository.save(libroTemporal);
    }
    
    // sobrecarga de metodo de actualizar registro
    public BookModel actualizarLibro(Long id, String title, String desc, String lang, Integer numOfPages) {
    	BookModel libroTemporal = bookRepository.findById(id).orElse(null);
    	if(libroTemporal != null) {
    		libroTemporal.setDescription(desc);
    		libroTemporal.setTitle(title);
    		libroTemporal.setNumberOfPages(numOfPages);
    		libroTemporal.setLanguage(lang);
    		bookRepository.save(libroTemporal);
    		return libroTemporal;
    	} else {
    		return libroTemporal;
    	}
    	
    }
    
    // Borrar libro
    public void borrarLibro(Long id) {
    	bookRepository.deleteById(id);
    }
    
    
    
}

