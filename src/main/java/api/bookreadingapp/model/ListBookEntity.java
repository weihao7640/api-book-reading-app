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
@Table(name="[LISTBOOK]")
@Getter @Setter
public class ListBookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_list;
	
	@Column (name="id_user_created_list")
	private int id_user_created_list;
	
	@Column (name="name_list")
	private String name_list;
	
	@Column (name="is_hiden_list")
	private Boolean is_hiden_list;
	
	@Column (name="image_list")
	private String image_list;
	
	@Column (name="created_date_list")
	private Date created_date_list;
	
	@Column (name="updated_date_list")
	private Date updated_date_list;

	public int getId_list() {
		return id_list;
	}

	public void setId_list(int id_list) {
		this.id_list = id_list;
	}

	public int getId_user_created_list() {
		return id_user_created_list;
	}

	public void setId_user_created_list(int id_user_created_list) {
		this.id_user_created_list = id_user_created_list;
	}

	public String getName_list() {
		return name_list;
	}

	public void setName_list(String name_list) {
		this.name_list = name_list;
	}

	public Boolean getIs_hiden_list() {
		return is_hiden_list;
	}

	public void setIs_hiden_list(Boolean is_hiden_list) {
		this.is_hiden_list = is_hiden_list;
	}

	public String getImage_list() {
		return image_list;
	}

	public void setImage_list(String image_list) {
		this.image_list = image_list;
	}

	public Date getCreated_date_list() {
		return created_date_list;
	}

	public void setCreated_date_list(Date created_date_list) {
		this.created_date_list = created_date_list;
	}

	public Date getUpdated_date_list() {
		return updated_date_list;
	}

	public void setUpdated_date_list(Date updated_date_list) {
		this.updated_date_list = updated_date_list;
	}

	public ListBookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
