package api.bookreadingapp.service;

import api.bookreadingapp.model.UserEntity;

public interface UserService {

	
	public UserEntity addUser(UserEntity user);
	public UserEntity checkAccount(String username,String hash_pw);
	
	
}
