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
@Table(name="[RECYCLEBIN_CHAPTER]")
@Getter @Setter
public class RecycleBinChapterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_recyclebin_chapter;
	
	@Column (name="id_chapter")
	private int id_chapter;
	
	@Column (name="id_user_delete")
	private int id_user_delete;
	
	@Column (name="created_date_delete")
	private Date created_date_delete;

	public int getId_recyclebin_chapter() {
		return id_recyclebin_chapter;
	}

	public void setId_recyclebin_chapter(int id_recyclebin_chapter) {
		this.id_recyclebin_chapter = id_recyclebin_chapter;
	}

	public int getId_chapter() {
		return id_chapter;
	}

	public void setId_chapter(int id_chapter) {
		this.id_chapter = id_chapter;
	}

	public int getId_user_delete() {
		return id_user_delete;
	}

	public void setId_user_delete(int id_user_delete) {
		this.id_user_delete = id_user_delete;
	}

	public Date getCreated_date_delete() {
		return created_date_delete;
	}

	public void setCreated_date_delete(Date created_date_delete) {
		this.created_date_delete = created_date_delete;
	}

	public RecycleBinChapterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
