package api.bookreadingapp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="[FOLLOW_BOOK]")
@Getter @Setter
public class FollowBookEntity {
	@Id
	@Column(name="id_user")
	private int id_user;
	@Column(name="id_book")
	private int id_book;
	@Column(name="created_date_followed")
	private Date created_date_followed;
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_book() {
		return id_book;
	}
	public void setId_book(int id_book) {
		this.id_book = id_book;
	}
	public Date getCreated_date_followed() {
		return created_date_followed;
	}
	public void setCreated_date_followed(Date created_date_followed) {
		this.created_date_followed = created_date_followed;
	}
	public FollowBookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
