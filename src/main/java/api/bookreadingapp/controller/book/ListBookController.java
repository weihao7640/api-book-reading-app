package api.bookreadingapp.controller.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.ListBookEntity;
import api.bookreadingapp.repository.ListBookRepository;

@RestController
@RequestMapping("/listbook")
public class ListBookController {
	@Autowired
	private ListBookRepository listbookservice;
	
	
	@GetMapping("")
	public List<ListBookEntity> getAll(){
		return listbookservice.getAll();
	}
	/*
	@PostMapping("")
	public List<ListBookEntity> getUserListBook(@RequestParam("id_user_created_list") int id_user_created_list){
		return listbookservice.getUserListBook(id_user_created_list);
	}
	
	@PostMapping("")
	public List<ListBookEntity> getUserListBookByName(@RequestParam("name_list") String name_list, @RequestParam("id_user_created_list") int id_user_created_list){
		return listbookservice.getUserListBookByName(name_list,id_user_created_list);
	}
	*/
}
