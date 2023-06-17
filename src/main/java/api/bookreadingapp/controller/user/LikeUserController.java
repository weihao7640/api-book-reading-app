package api.bookreadingapp.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.LikeUserEntity;
import api.bookreadingapp.repository.LikeUserRepository;

@RestController
@RequestMapping("/likeuser")
public class LikeUserController {
	@Autowired
	private LikeUserRepository flservice;
	
	
	@GetMapping("")
	public List<LikeUserEntity> getAll(){
		return flservice.getAll();
	}
	
	@PostMapping("/melike")
    public List<LikeUserEntity> getUserMeLike(@RequestParam("id_user") int id_user) {
        return flservice.getUserMeLike(id_user);
    }

	@PostMapping("/likeme")
    public List<LikeUserEntity> getUserLikeMe(@RequestParam("id_isliked_user") int id_islike_user) {
        return flservice.getUserLikeMe(id_islike_user);
    }
}
