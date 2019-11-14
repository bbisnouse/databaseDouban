package data;

import java.io.Serializable;
import java.util.*;
public class Movie implements Serializable {
	private int Movie_id;
	private String Movie_name;
	private String Country;
	private String Language;
	private String Releasedate;
	private Integer Time;
	private String IMdb;
	private String Synopsis;
	private String Movie_Image;
	
	public int getMovie_id() {
		return Movie_id;
	}
	public void setMovie_id(int movie_id) {
		Movie_id = movie_id;
	}
	public String getMovie_name() {
		return Movie_name;
	}
	public void setMovie_name(String movie_name) {
		Movie_name = movie_name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getReleasedate() {
		return Releasedate;
	}
	public void setReleasedate(String releasedate) {
		Releasedate = releasedate;
	}
	public Integer getTime() {
		return Time;
	}
	public void setTime(Integer time) {
		Time = time;
	}
	public String getIMdb() {
		return IMdb;
	}
	public void setIMdb(String iMdb) {
		IMdb = iMdb;
	}
	public String getSynopsis() {
		return Synopsis;
	}
	public void setSynopsis(String synopsis) {
		Synopsis = synopsis;
	}
	public String getMovie_Image() {
		return Movie_Image;
	}
	public void setMovie_Image(String movie_Image) {
		Movie_Image = movie_Image;
	}	
}
