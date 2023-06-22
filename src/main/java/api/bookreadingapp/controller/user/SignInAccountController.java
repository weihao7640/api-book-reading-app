package api.bookreadingapp.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.bookreadingapp.model.BookEntity;
import api.bookreadingapp.model.UserEntity;
import api.bookreadingapp.repository.UserRepository;
import api.bookreadingapp.service.UserService;
@RestController
public class SignInAccountController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserService userService;
	
	@PostMapping("/signin")    
	public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity user) {
    	UserEntity userEntity= userService.addUser(user);
	        return new ResponseEntity<>(userEntity, HttpStatus.CREATED);
	    }
}
