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
@Table(name="[COMMENTS]")
@Getter @Setter
public class CommentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_comment;
	
	@Column(name="id_chapter")
	private int id_chapter;
	@Column(name="id_user")
	private int id_user;
	@Column(name="comment")
	private String comment;
	@Column(name="created_date_cmt")
	private Date created_date_cmt;
	@Column(name="updated_date_cmt")
	private Date updated_date_cmt;
	public int getId_comment() {
		return id_comment;
	}
	public void setId_comment(int id_comment) {
		this.id_comment = id_comment;
	}
	public int getId_chapter() {
		return id_chapter;
	}
	public void setId_chapter(int id_chapter) {
		this.id_chapter = id_chapter;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreated_date_cmt() {
		return created_date_cmt;
	}
	public void setCreated_date_cmt(Date created_date_cmt) {
		this.created_date_cmt = created_date_cmt;
	}
	public Date getUpdated_date_cmt() {
		return updated_date_cmt;
	}
	public void setUpdated_date_cmt(Date updated_date_cmt) {
		this.updated_date_cmt = updated_date_cmt;
	}
	
	public CommentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}