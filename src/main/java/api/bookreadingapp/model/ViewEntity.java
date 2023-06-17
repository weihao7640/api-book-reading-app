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
@Table(name="[VIEW]")
@Getter @Setter
public class ViewEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_view;
	
	@Column (name="id_book")
	private int id_book;
	
	@Column (name="id_user")
	private int id_user;
	
	@Column (name="created_date_view")
	private Date created_date_view;
	
	@Column (name="updated_date_view")
	private Date updated_date_view;
	
	@Column (name="count_view")
	private int count_view;

	public int getId_view() {
		return id_view;
	}

	public void setId_view(int id_view) {
		this.id_view = id_view;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public Date getCreated_date_view() {
		return created_date_view;
	}

	public void setCreated_date_view(Date created_date_view) {
		this.created_date_view = created_date_view;
	}

	public Date getUpdated_date_view() {
		return updated_date_view;
	}

	public void setUpdated_date_view(Date updated_date_view) {
		this.updated_date_view = updated_date_view;
	}

	public int getCount_view() {
		return count_view;
	}

	public void setCount_view(int count_view) {
		this.count_view = count_view;
	}

	public ViewEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
