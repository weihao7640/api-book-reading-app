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
@Table(name="[BOOKS]")
@Getter @Setter
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_book;
	
	
	@Column (name="name_book")
	private String name_book;
	
	
	@Column (name="poster_book")
	private String poster_book;
	
	
	@Column (name="description_book")
	private String description_book;
	
	@Column (name="id_category")
	private int id_category;
	
	
	@Column (name="is_actived_book")
	private Boolean is_actived_book;
	
	
	@Column (name= "is_hiden_book")
	private Boolean is_hiden_book;
	
	
	@Column (name="is_on_rabit_book")
	private Boolean is_on_rabit_book;
	
	
	@Column (name ="price_book")
	private int price_book;
	
	
	@Column (name = "created_date_book")
	private Date created_date_book;
	
	@Column (name = "updated_date_book")
	private Date updated_date_book;

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public String getName_book() {
		return name_book;
	}

	public void setName_book(String name_book) {
		this.name_book = name_book;
	}

	public String getPoster_book() {
		return poster_book;
	}

	public void setPoster_book(String poster_book) {
		this.poster_book = poster_book;
	}

	public String getDescription_book() {
		return description_book;
	}

	public void setDescription_book(String description_book) {
		this.description_book = description_book;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public Boolean getIs_actived_book() {
		return is_actived_book;
	}

	public void setIs_actived_book(Boolean is_actived_book) {
		this.is_actived_book = is_actived_book;
	}

	public Boolean getIs_hiden_book() {
		return is_hiden_book;
	}

	public void setIs_hiden_book(Boolean is_hiden_book) {
		this.is_hiden_book = is_hiden_book;
	}

	public Boolean getIs_on_rabit_book() {
		return is_on_rabit_book;
	}

	public void setIs_on_rabit_book(Boolean is_on_rabit_book) {
		this.is_on_rabit_book = is_on_rabit_book;
	}

	public int getPrice_book() {
		return price_book;
	}

	public void setPrice_book(int price_book) {
		this.price_book = price_book;
	}

	public Date getCreated_date_book() {
		return created_date_book;
	}

	public void setCreated_date_book(Date created_date_book) {
		this.created_date_book = created_date_book;
	}

	public Date getUpdated_date_book() {
		return updated_date_book;
	}

	public void setUpdated_date_book(Date updated_date_book) {
		this.updated_date_book = updated_date_book;
	}

	public BookEntity(int id_book, String name_book, String poster_book, String description_book, int id_category,
			Boolean is_actived_book, Boolean is_hiden_book, Boolean is_on_rabit_book, int price_book, Date created_date_book,
			Date updated_date_book) {
		super();
		this.id_book = id_book;
		this.name_book = name_book;
		this.poster_book = poster_book;
		this.description_book = description_book;
		this.id_category = id_category;
		this.is_actived_book = is_actived_book;
		this.is_hiden_book = is_hiden_book;
		this.is_on_rabit_book = is_on_rabit_book;
		this.price_book = price_book;
		this.created_date_book = created_date_book;
		this.updated_date_book = updated_date_book;
	}
	
	public BookEntity() {super();}
	
	
	
	
	

}
