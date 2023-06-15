package api.bookreadingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="[ACTORS_BOOK]")
@Getter @Setter
public class ActorBookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name="id_book")
	private int id_book;
	
	@Column (name="id_user")
	private int id_user;

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

	public ActorBookEntity(int id_book, int id_user) {
		super();
		this.id_book = id_book;
		this.id_user = id_user;
	}
	
	public ActorBookEntity() {super();}
	
}
