package api.bookreadingapp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ITEM_LISTBOOK")
@Getter @Setter
public class ItemListBookEntity {
	@Id
	@Column(name="id_list")
	private int id_list;
	@Column(name="id_book")
	private int id_book;
	@Column(name="created_date_list")
	private Date created_date_list;
	public int getId_list() {
		return id_list;
	}
	public void setId_list(int id_list) {
		this.id_list = id_list;
	}
	public int getId_book() {
		return id_book;
	}
	public void setId_book(int id_book) {
		this.id_book = id_book;
	}
	public Date getCreated_date_list() {
		return created_date_list;
	}
	public void setCreated_date_list(Date created_date_list) {
		this.created_date_list = created_date_list;
	}
	
	public ItemListBookEntity() {
		super();
	}
}
