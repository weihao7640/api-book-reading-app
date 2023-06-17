package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.RecycleBinBookEntity;

public interface RecycleBinBookRepository extends JpaRepository<RecycleBinBookEntity, Integer>{
	@Query(value="select * from [RECYCLEBIN_BOOK]", nativeQuery = true)
	public List<RecycleBinBookEntity> getAll();
}
