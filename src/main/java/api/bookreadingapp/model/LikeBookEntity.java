package api.bookreadingapp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="LIKE_BOOK")
@Getter @Setter
public class LikeBookEntity {
	@Id
	@Column(name="id_book")
	private int id_book;
	@Column(name="id_user")
	private int id_user;
	@Column(name="created_date_liked")
	private Date created_date_liked;
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
	public Date getCreated_date_liked() {
		return created_date_liked;
	}
	public void setCreated_date_liked(Date created_date_liked) {
		this.created_date_liked = created_date_liked;
	}
	public LikeBookEntity() {
		super();
	}
}
