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
@Table(name="[CHAPTERS]")
@Getter @Setter
public class ChapterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_chapter;
	
	
	@Column (name="name_chapter")
	private String name_chapter;
	
	
	@Column (name="image_chapter")
	private String image_chapter;
	
	
	@Column (name="content_chapter")
	private String content_chapter;
	
	@Column (name="id_book")
	private int id_book;
	
	
	@Column (name="is_actived_chapter")
	private Boolean is_actived_chapter;
	
	
	@Column (name= "is_hiden_chapter")
	private Boolean is_hiden_chapter;
	
	
	@Column (name="is_on_rabit_chapter")
	private Boolean is_on_rabit_chapter;
	
	
	@Column (name ="price_chapter")
	private int price_chapter;
	
	
	@Column (name = "created_date_chapter")
	private Date created_date_chapter;
	
	@Column (name = "updated_date_chapter")
	private Date updated_date_chapter;

	public int getId_chapter() {
		return id_chapter;
	}

	public void setId_chapter(int id_chapter) {
		this.id_chapter = id_chapter;
	}

	public String getName_chapter() {
		return name_chapter;
	}

	public void setName_chapter(String name_chapter) {
		this.name_chapter = name_chapter;
	}

	public String getImage_chapter() {
		return image_chapter;
	}

	public void setImage_chapter(String image_chapter) {
		this.image_chapter = image_chapter;
	}

	public String getContent_chapter() {
		return content_chapter;
	}

	public void setContent_chapter(String content_chapter) {
		this.content_chapter = content_chapter;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public Boolean getIs_actived_chapter() {
		return is_actived_chapter;
	}

	public void setIs_actived_chapter(Boolean is_actived_chapter) {
		this.is_actived_chapter = is_actived_chapter;
	}

	public Boolean getIs_hiden_chapter() {
		return is_hiden_chapter;
	}

	public void setIs_hiden_chapter(Boolean is_hiden_chapter) {
		this.is_hiden_chapter = is_hiden_chapter;
	}

	public Boolean getIs_on_rabit_chapter() {
		return is_on_rabit_chapter;
	}

	public void setIs_on_rabit_chapter(Boolean is_on_rabit_chapter) {
		this.is_on_rabit_chapter = is_on_rabit_chapter;
	}

	public int getPrice_chapter() {
		return price_chapter;
	}

	public void setPrice_chapter(int price_chapter) {
		this.price_chapter = price_chapter;
	}

	public Date getCreated_date_chapter() {
		return created_date_chapter;
	}

	public void setCreated_date_chapter(Date created_date_chapter) {
		this.created_date_chapter = created_date_chapter;
	}

	public Date getUpdated_date_chapter() {
		return updated_date_chapter;
	}

	public void setUpdated_date_chapter(Date updated_date_chapter) {
		this.updated_date_chapter = updated_date_chapter;
	}

	public ChapterEntity(int id_chapter, String name_chapter, String image_chapter, String content_chapter, int id_book,
			Boolean is_actived_chapter, Boolean is_hiden_chapter, Boolean is_on_rabit_chapter, int price_chapter,
			Date created_date_chapter, Date updated_date_chapter) {
		super();
		this.id_chapter = id_chapter;
		this.name_chapter = name_chapter;
		this.image_chapter = image_chapter;
		this.content_chapter = content_chapter;
		this.id_book = id_book;
		this.is_actived_chapter = is_actived_chapter;
		this.is_hiden_chapter = is_hiden_chapter;
		this.is_on_rabit_chapter = is_on_rabit_chapter;
		this.price_chapter = price_chapter;
		this.created_date_chapter = created_date_chapter;
		this.updated_date_chapter = updated_date_chapter;
	}

	public ChapterEntity() {super();}
	
}
