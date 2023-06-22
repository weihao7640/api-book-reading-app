package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	@Query(value="select * from [USERS]", nativeQuery = true)
	public List<UserEntity> getAll();

	@Query(value="select * from [USERS] where username_user=?", nativeQuery = true)
	public List<UserEntity> getUserByUsername(String username_user);
	
	@Query(value="select * from [USERS] inner join [FOLLOW_BOOK] on USERS.id_user = FOLLOW_BOOK.id_user where FOLLOW_BOOK.id_book=?", nativeQuery = true)
	public List<UserEntity> getUserFollowBook(int id_book);
	
	@Query(value="select * from [USERS] inner join [FOLLOW_ACTOR] on USERS.id_user = FOLLOW_ACTOR.id_user where FOLLOW_ACTOR.id_actor=?", nativeQuery = true)
	public List<UserEntity> getUserFollowActor(int id_actor);
	
	
	
	
	
	
	
}
