package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.RecycleBinChapterEntity;

public interface RecycleBinChapterRepository extends JpaRepository<RecycleBinChapterEntity, Integer>{
	@Query(value="select * from [RECYCLEBIN_CHAPTER]", nativeQuery = true)
	public List<RecycleBinChapterEntity> getAll();
}
