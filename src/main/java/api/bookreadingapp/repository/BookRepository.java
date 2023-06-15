package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.bookreadingapp.model.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer>  {

	@Query(value="select * from [BOOKS]", nativeQuery = true)
	public List<BookEntity> getAll();
	
	
	
}
