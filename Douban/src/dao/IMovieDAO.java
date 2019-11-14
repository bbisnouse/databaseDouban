package dao;
import java.util.*;

import data.*;

public interface IMovieDAO {
	public Movie MovieInfo_finById(int Movie_id) throws Exception;
	public List<Movie> MovieInfo_finByName(String Movie_name) throws Exception;
	public boolean MovieInfo_add(String Movie_name,String Country,String Language,String Release_date,Integer Time,String IMDb,String Synopsis,String Movie_Image) throws Exception;
	public boolean MovieInfo_del(int Movie_id) throws Exception;
	public boolean MovieInfo_change(int Movie_id,String Movie_name,String Country,String Language,String Release_date,Integer Time,String IMDb,String Synopsis,String Movie_Image) throws Exception;
	public List<Cast> Movie_Actor(Movie movie) throws Exception;
	public List<Integer> dofind_bymovieid(int Movie_id)throws Exception;
}
/*
private Integer Moive_id;
private String Moive_name;
private String Country;
private String Language;
private String Release_date;
private Integer Time;
private Integer IMDb;
private String Synopsis;
private String Movie_Image; 
 */
