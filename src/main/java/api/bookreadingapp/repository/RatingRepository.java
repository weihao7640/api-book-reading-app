package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.RatingEntity;

public interface RatingRepository extends JpaRepository<RatingEntity, Integer> {
	@Query(value="select * from [RATINGS]", nativeQuery = true)
	public List<RatingEntity> getAll();
	
	@Query(value="select * from [RATINGS] where id_book=?1 and id_user=?2 ",nativeQuery = true)
	public List<RatingEntity> getUserRating(int id_book,int id_user);

	@Query(value="insert into [RATINGS] (id_book, id_user, rating, comment) values (?1, ?2, ?3, ?4)", nativeQuery = true)
	public RatingEntity save(int id_book,int id_user, int rating, String comment);
		
}
