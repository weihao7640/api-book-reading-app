package api.bookreadingapp.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.RatingEntity;
import api.bookreadingapp.repository.RatingRepository;

@RestController
@RequestMapping("/rating")
public class RatingController {
	@Autowired
	private RatingRepository ratingservice;
	
	
	@GetMapping("")
	public List<RatingEntity> getAll(){
		return ratingservice.getAll();
	}
	
	@PostMapping("/userRating")
    public List<RatingEntity> getUserRating(@RequestParam("id_book") int id_book,@RequestParam("id_user") int id_user) {
        return ratingservice.getUserRating(id_book,id_user);
    }
}
