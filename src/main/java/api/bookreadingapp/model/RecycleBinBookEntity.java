package api.bookreadingapp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="[RECYCLEBIN_BOOK]")
@Getter @Setter
public class RecycleBinBookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_recyclebin_book;
	
	@Column (name="id_book")
	private int id_book;
	
	@Column (name="id_user_delete_book")
	private int id_user_delete_book;
	
	@Column (name="created_date_delete")
	private Date created_date_delete;

	public int getId_recyclebin_book() {
		return id_recyclebin_book;
	}

	public void setId_recyclebin_book(int id_recyclebin_book) {
		this.id_recyclebin_book = id_recyclebin_book;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public int getId_user_delete_book() {
		return id_user_delete_book;
	}

	public void setId_user_delete_book(int id_user_delete_book) {
		this.id_user_delete_book = id_user_delete_book;
	}

	public Date getCreated_date_delete() {
		return created_date_delete;
	}

	public void setCreated_date_delete(Date created_date_delete) {
		this.created_date_delete = created_date_delete;
	}

	public RecycleBinBookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
