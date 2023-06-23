package api.bookreadingapp.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.UserEntity;
import api.bookreadingapp.repository.UserRepository;
import api.bookreadingapp.service.UserService;
@RestController
public class LoginAccountController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserService userService;
	
	@PostMapping("/login")    
	public UserEntity LoginUser(@RequestParam("") String username, @RequestParam("") String hash_pw) {
    			return userService.checkAccount(username,hash_pw);
	    }
}
