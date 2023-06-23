package api.bookreadingapp.serviceImpl;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.bookreadingapp.model.UserEntity;
import api.bookreadingapp.repository.UserRepository;
import api.bookreadingapp.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserEntity addUser(UserEntity user) {
		/*
		 * UserEntity userEntity= new UserEntity();
		 * userEntity.setUsername_user(user.getUsername_user());
		 * userEntity.setFullname_user(user.getFullname_user());
		 * userEntity.setBirthday_user(user.getBirthday_user());
		 * userEntity.setHash_password_user(user.getHash_password_user());
		 * userEntity.setSalt_user(user.getSalt_user()); userEntity.setAvatar_user("");
		 * userEntity.setPhone_user(""); userEntity.setEmail_user(user.getEmail_user());
		 * userEntity.setGender_user(user.getGender_user());
		 * userEntity.setIs_active_email_user(false);
		 * userEntity.setIs_active_phone_user(false);
		 * userEntity.setIs_active_user(true); userEntity.setIs_hiden_user(false);
		 * userEntity.setCreated_date_user(null); userEntity.setUpdated_date_user(null);
		 */
		return userRepository.save(user);
		 //return userEntity;
	}
	public UserEntity checkAccount(String username,String hash_pw) {
		
		return userRepository.checkAccount(username,hash_pw);
	}
}

