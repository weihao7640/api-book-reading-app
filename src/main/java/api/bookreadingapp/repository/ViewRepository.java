package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.ViewEntity;

public interface ViewRepository extends JpaRepository<ViewEntity, Integer>{
	@Query(value="select * from [VIEWS]", nativeQuery = true)
	public List<ViewEntity> getAll();
}
