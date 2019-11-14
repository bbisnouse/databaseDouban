package data;

import java.io.Serializable;


public class Belong implements Serializable{
	private Integer Movie_id;
	private Integer type_id;
	public int getMovie_id() {
		return Movie_id;
	}
	public void setMovie_id(int movie_id) {
		Movie_id = movie_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	
}
