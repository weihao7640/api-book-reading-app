package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.FollowBookEntity;

public interface FollowBookRepository extends JpaRepository<FollowBookEntity, Integer>  {
	@Query(value="select * from [FOLLOW_BOOK]", nativeQuery = true)
	public List<FollowBookEntity> getAll();
	
	@Query(value="select * from [FOLLOW_BOOK] where id_book=?1",nativeQuery = true)
	public List<FollowBookEntity> getUserFollowBook(int id_book);
	
	@Query(value="select * from [FOLLOW_BOOK] where id_user=?1",nativeQuery = true)
	public List<FollowBookEntity> getBookFollowOfUser(int id_user);

}
