package api.bookreadingapp.controller.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.BookEntity;
import api.bookreadingapp.repository.BookRepository;

@RestController
public class BookManagement {

	
	
	@Autowired
	private BookRepository book;
	
	@GetMapping()
	public List<BookEntity> findAll(){
		return book.getAll();
	}
	@GetMapping("/getallbook")
	public List<BookEntity> getAll(@RequestParam("year") int i){
		return book.getAll();
	}
	
	
	
	
}
