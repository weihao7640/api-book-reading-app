package api.bookreadingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import api.bookreadingapp.model.ItemListBookEntity;

public interface ItemListBookRepository extends JpaRepository<ItemListBookEntity, Integer>  {
	@Query(value="select * from [ITEM_LISTBOOK]", nativeQuery = true)
	public List<ItemListBookEntity> getAll();
	
	@Query(value="select * from [ITEM_LISTBOOK] where id_list=?1",nativeQuery = true)
	public List<ItemListBookEntity> getItemListBook(int id_list);
	

}
