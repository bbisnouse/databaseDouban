package data;

import java.io.Serializable;
import java.util.Date;


public class Commence implements Serializable {
	private int Commence_id;
	private String Commence_text;
	private Date Commence_time;
	private int Topic_id;
	private int User_id;
	public int getCommence_id() {
		return Commence_id;
	}
	public void setCommence_id(int commence_id) {
		Commence_id = commence_id;
	}
	public String getCommence_text() {
		return Commence_text;
	}
	public void setCommence_text(String commence_text) {
		Commence_text = commence_text;
	}
	public Date getCommence_time() {
		return Commence_time;
	}
	public void setCommence_time(Date commence_time) {
		Commence_time = commence_time;
	}
	public int getTopic_id() {
		return Topic_id;
	}
	public void setTopic_id(int topic_id) {
		Topic_id = topic_id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	
}
