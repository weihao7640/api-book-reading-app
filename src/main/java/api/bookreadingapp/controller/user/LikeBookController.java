package api.bookreadingapp.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.LikeBookEntity;
import api.bookreadingapp.repository.LikeBookRepository;

@RestController
@RequestMapping("/likebook")
public class LikeBookController {
	@Autowired
	private LikeBookRepository flservice;
	
	
	@GetMapping("")
	public List<LikeBookEntity> getAll(){
		return flservice.getAll();
	}
	
	@PostMapping("/userlikebook")
    public List<LikeBookEntity> getUserLikeBook(@RequestParam("id_book") int id_book) {
        return flservice.getUserLikeBook(id_book);
    }

	@PostMapping("/booklikeofuser")
    public List<LikeBookEntity> getBookLikeOfUser(@RequestParam("id_user") int id_user) {
        return flservice.getBookLikeOfUser(id_user);
    }
}
