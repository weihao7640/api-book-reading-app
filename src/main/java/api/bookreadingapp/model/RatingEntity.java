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
@Table(name="[RATINGS]")
@Getter @Setter
public class RatingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_rating;
	
	@Column (name="id_user")
	private int id_user;
	
	@Column (name="id_book")
	private int id_book;
	
	@Column (name="rating")
	private int rating;
	
	@Column (name="comment")
	private String comment;
	
	@Column (name="created_date_rating")
	private Date created_date_rating;
	
	@Column (name="updated_date_rating")
	private Date updated_date_rating;

	public int getId_rating() {
		return id_rating;
	}

	public void setId_rating(int id_rating) {
		this.id_rating = id_rating;
	}

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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreated_date_rating() {
		return created_date_rating;
	}

	public void setCreated_date_rating(Date created_date_rating) {
		this.created_date_rating = created_date_rating;
	}

	public Date getUpdated_date_rating() {
		return updated_date_rating;
	}

	public void setUpdated_date_rating(Date updated_date_rating) {
		this.updated_date_rating = updated_date_rating;
	}

	public RatingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
