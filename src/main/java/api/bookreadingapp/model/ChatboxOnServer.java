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
@Table(name="[CHATBOX_ON_SERVER]")
@Getter @Setter
public class ChatboxOnServer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_chatbox;
	
	
	@Column (name="id_user")
	private int id_user;
	
	
	@Column (name="chat_content")
	private String chat_content;
	
	
	@Column (name="created_date_chatbox")
	private Date created_date_chatbox;
	
}
