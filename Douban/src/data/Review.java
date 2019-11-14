package data;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable {
	private int Review_id;
	private String Review_text;
	private Date Review_time;
	private float Review_point;
	private Integer Review_like;
	private Integer Review_unlike;
	private int Movie_id;
	private int User_id;
	public int getReview_id() {
		return Review_id;
	}
	public void setReview_id(int review_id) {
		Review_id = review_id;
	}
	public String getReview_text() {
		return Review_text;
	}
	public void setReview_text(String review_text) {
		Review_text = review_text;
	}
	public Date getReview_time() {
		return Review_time;
	}
	public void setReview_time(Date review_time) {
		Review_time = review_time;
	}
	public float getReview_point() {
		return Review_point;
	}
	public void setReview_point(float review_point) {
		Review_point = review_point;
	}
	public Integer getReview_like() {
		return Review_like;
	}
	public void setReview_like(Integer review_like) {
		Review_like = review_like;
	}
	public Integer getReview_unlike() {
		return Review_unlike;
	}
	public void setReview_unlike(Integer review_unlike) {
		Review_unlike = review_unlike;
	}
	public int getMovie_id() {
		return Movie_id;
	}
	public void setMovie_id(int movie_id) {
		Movie_id = movie_id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	
}
