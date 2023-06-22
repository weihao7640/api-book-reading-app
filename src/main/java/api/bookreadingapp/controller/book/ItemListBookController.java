package api.bookreadingapp.controller.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.ItemListBookEntity;
import api.bookreadingapp.repository.ItemListBookRepository;

@RestController
@RequestMapping("/itemlistbook")
public class ItemListBookController {
	@Autowired
	private ItemListBookRepository flservice;
	
	
	@GetMapping("")
	public List<ItemListBookEntity> getAll(){
		return flservice.getAll();
	}
	
	@PostMapping("/bookforlist")
    public List<ItemListBookEntity> getUserFollowBook(@RequestParam("id_list") int id_list) {
        return flservice.getItemListBook(id_list);
    }

}
