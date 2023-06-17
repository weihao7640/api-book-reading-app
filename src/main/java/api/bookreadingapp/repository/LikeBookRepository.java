package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.LikeBookEntity;

public interface LikeBookRepository extends JpaRepository<LikeBookEntity, Integer>  {
	@Query(value="select * from [LIKE_BOOK]", nativeQuery = true)
	public List<LikeBookEntity> getAll();
	
	@Query(value="select * from [LIKE_BOOK] where id_book=?1",nativeQuery = true)
	public List<LikeBookEntity> getUserLikeBook(int id_book);
	
	@Query(value="select * from [LIKE_BOOK] where id_user=?1",nativeQuery = true)
	public List<LikeBookEntity> getBookLikeOfUser(int id_user);

}
