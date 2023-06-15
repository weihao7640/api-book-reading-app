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
@Table(name="[CATEGORIES]")
@Getter @Setter
public class CategoryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_category;
	
	
	@Column (name="name_category")
	private String name_category;
	
	
	@Column (name="image_category")
	private String image_category;
	
	
	@Column (name="description_category")
	private String description_category;
	
	
	
	@Column (name="is_actived_category")
	private Boolean is_actived_category;
	
	
	@Column (name= "is_hiden_category")
	private Boolean is_hiden_category;
	
	
	@Column (name = "created_date_category")
	private Date created_date_category;
	
	@Column (name = "updated_date_category")
	private Date updated_date_category;

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getName_category() {
		return name_category;
	}

	public void setName_category(String name_category) {
		this.name_category = name_category;
	}

	public String getImage_category() {
		return image_category;
	}

	public void setImage_category(String image_category) {
		this.image_category = image_category;
	}

	public String getDescription_category() {
		return description_category;
	}

	public void setDescription_category(String description_category) {
		this.description_category = description_category;
	}

	public Boolean getIs_actived_category() {
		return is_actived_category;
	}

	public void setIs_actived_category(Boolean is_actived_category) {
		this.is_actived_category = is_actived_category;
	}

	public Boolean getIs_hiden_category() {
		return is_hiden_category;
	}

	public void setIs_hiden_category(Boolean is_hiden_category) {
		this.is_hiden_category = is_hiden_category;
	}

	public Date getCreated_date_category() {
		return created_date_category;
	}

	public void setCreated_date_category(Date created_date_category) {
		this.created_date_category = created_date_category;
	}

	public Date getUpdated_date_category() {
		return updated_date_category;
	}

	public void setUpdated_date_category(Date updated_date_category) {
		this.updated_date_category = updated_date_category;
	}

	public CategoryEntity(int id_category, String name_category, String image_category, String description_category,
			Boolean is_actived_category, Boolean is_hiden_category, Date created_date_category,
			Date updated_date_category) {
		super();
		this.id_category = id_category;
		this.name_category = name_category;
		this.image_category = image_category;
		this.description_category = description_category;
		this.is_actived_category = is_actived_category;
		this.is_hiden_category = is_hiden_category;
		this.created_date_category = created_date_category;
		this.updated_date_category = updated_date_category;
	}
	
	public CategoryEntity() {super();}
	
}
