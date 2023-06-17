package api.bookreadingapp.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.FollowActorEntity;
import api.bookreadingapp.repository.FollowActorRepository;

@RestController
@RequestMapping("/followactor")
public class FollowActorController {
	@Autowired
	private FollowActorRepository flservice;
	
	
	@GetMapping("")
	public List<FollowActorEntity> getAll(){
		return flservice.getAll();
	}
	
	@PostMapping("/listfollow_actoruser")
    public List<FollowActorEntity> getUserFollowActor(@RequestParam("id_actor") int id_actor) {
        return flservice.getUserFollowActor(id_actor);
    }

	@PostMapping("/listfollow_useractor")
    public List<FollowActorEntity> getActorFollowOfUser(@RequestParam("id_user") int id_user) {
        return flservice.getActorFollowOfUser(id_user);
    }
}
