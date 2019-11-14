package dao;

import java.util.*;
import data.*;

public interface IReviewDAO {
	public List<Review> ReviewInfo_finById(int Moive_id) throws Exception;
	public boolean Review_doUpdateGood(int Review_id) throws Exception;
	public boolean Review_doUpdateBad(int Review_id) throws Exception;
	public boolean Review_doUpdate(int Review_id,String Review_text,Date Review_time,float Review_point,
			Integer Review_like,Integer Review_unlike,Integer Movie_id,Integer User_id) throws Exception;
	public boolean Review_doRemove(int Review_id) throws Exception;
	public boolean Review_add(String Review_text,Date Review_time,float Review_point,
			Integer Movie_id,Integer User_id) throws Exception;
}
/*
private Integer Review_id;
private String Review_text;
private Date Review_time;
private float Review_point;
private Integer Review_like;
private Integer Review_unlike;
private Integer Movie_id;
private Integer User_id;
*/
