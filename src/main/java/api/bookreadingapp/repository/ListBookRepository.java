package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.ListBookEntity;

public interface ListBookRepository extends JpaRepository<ListBookEntity, Integer>{
	@Query(value="select * from [LISTBOOK]", nativeQuery = true)
	public List<ListBookEntity> getAll();
	
	@Query(value="select * from [LISTBOOK] where id_user_created_list=? ",nativeQuery = true)
	public List<ListBookEntity> getUserListBook(int id_user_created_list);
	
	@Query(value="select * from [LISTBOOK] where name_list=?1 and id_user_created_list=?2 ",nativeQuery = true)
	public List<ListBookEntity> getUserListBookByName(String name_list, int id_user_created_list);
	
	@Query(value="insert into [LISTBOOK] (name_list, id_user_created_list, is_hiden_list) values (?1, ?2, ?3) ",nativeQuery = true)
	public ListBookEntity save(String name_list, int id_user_created_list, Boolean is_hiden_list);
	
	
}
