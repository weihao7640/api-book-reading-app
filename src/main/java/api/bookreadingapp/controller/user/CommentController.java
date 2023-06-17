package api.bookreadingapp.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.CommentEntity;
import api.bookreadingapp.repository.CommentRepository;

@RestController
@RequestMapping("/cmt")
public class CommentController {
	@Autowired
	private CommentRepository cmtservice;
	
	
	@GetMapping("")
	public List<CommentEntity> getAll(){
		return cmtservice.getAll();
	}
	
	@PostMapping("/usercmt")
    public List<CommentEntity> getUserRating(@RequestParam("id_comment") int id_comment,@RequestParam("id_chapter") int id_chapter,@RequestParam("id_user") int id_user) {
        return cmtservice.getUserComment(id_comment,id_chapter,id_user);
    }
}
