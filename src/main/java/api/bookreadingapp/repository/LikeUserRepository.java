package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.LikeUserEntity;

public interface LikeUserRepository extends JpaRepository<LikeUserEntity, Integer>  {
	@Query(value="select * from [LIKE_BOOK]", nativeQuery = true)
	public List<LikeUserEntity> getAll();
	
	@Query(value="select * from [LIKE_BOOK] where id_user=?1",nativeQuery = true)
	public List<LikeUserEntity> getUserMeLike(int id_user);
	
	@Query(value="select * from [LIKE_BOOK] where id_isliked_user=?1",nativeQuery = true)
	public List<LikeUserEntity> getUserLikeMe(int id_isliked_user);

}
