package api.bookreadingapp.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.FollowBookEntity;
import api.bookreadingapp.repository.FollowBookRepository;

@RestController
@RequestMapping("/followbook")
public class FollowBookController {
	@Autowired
	private FollowBookRepository flservice;
	
	
	@GetMapping("")
	public List<FollowBookEntity> getAll(){
		return flservice.getAll();
	}
	
	@PostMapping("/listfollow_bookuser")
    public List<FollowBookEntity> getUserFollowBook(@RequestParam("id_book") int id_book) {
        return flservice.getUserFollowBook(id_book);
    }

	@PostMapping("/listfollow_userbook")
    public List<FollowBookEntity> getBookFollowOfUser(@RequestParam("id_user") int id_user) {
        return flservice.getBookFollowOfUser(id_user);
    }
}
