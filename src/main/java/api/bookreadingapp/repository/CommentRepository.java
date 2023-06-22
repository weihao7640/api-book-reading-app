package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Integer>  {
	@Query(value="select * from [COMMENTS]", nativeQuery = true)
	public List<CommentEntity> getAll();
	
	@Query(value="select * from [COMMENTS] where id_comment=?1 and id_chapter=?2 and id_user=?3",nativeQuery = true)
	public List<CommentEntity> getUserComment(int id_comment,int id_chapter, int id_user);

}
