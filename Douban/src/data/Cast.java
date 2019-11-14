package data;

import java.io.Serializable;
import java.util.Date;

public class Cast implements Serializable {
	private int cast_id;
	private String cast_name;
	private String cast_sex;
	private String constellation;
	private Date cast_birth;
	private String cast_homeplace;
	private String cast_nickname;
	private String cast_occupation;
	private String cast_IMDb;
	private String cast_image;
	private String cast_reward;
	private String cast_text;
	
	public int getCast_id() {
		return cast_id;
	}
	public void setCast_id(int cast_id) {
		this.cast_id = cast_id;
	}
	public String getCast_name() {
		return cast_name;
	}
	public void setCast_name(String cast_name) {
		this.cast_name = cast_name;
	}
	public String getCast_sex() {
		return cast_sex;
	}
	public void setCast_sex(String cast_sex) {
		this.cast_sex = cast_sex;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public Date getCast_birth() {
		return cast_birth;
	}
	public void setCast_birth(Date cast_birth) {
		this.cast_birth = cast_birth;
	}
	public String getCast_homeplace() {
		return cast_homeplace;
	}
	public void setCast_homeplace(String cast_homeplace) {
		this.cast_homeplace = cast_homeplace;
	}
	public String getCast_nickname() {
		return cast_nickname;
	}
	public void setCast_nickname(String cast_nickname) {
		this.cast_nickname = cast_nickname;
	}
	public String getCast_occupation() {
		return cast_occupation;
	}
	public void setCast_occupation(String cast_occupation) {
		this.cast_occupation = cast_occupation;
	}
	public String getCast_IMDb() {
		return cast_IMDb;
	}
	public void setCast_IMDb(String cast_IMDb) {
		this.cast_IMDb = cast_IMDb;
	}
	public String getCast_image() {
		return cast_image;
	}
	public void setCast_image(String cast_image) {
		this.cast_image = cast_image;
	}
	public String getCast_reward() {
		return cast_reward;
	}
	public void setCast_reward(String cast_reward) {
		this.cast_reward = cast_reward;
	}
	public String getCast_text() {
		return cast_text;
	}
	public void setCast_text(String cast_text) {
		this.cast_text = cast_text;
	}
	
}
