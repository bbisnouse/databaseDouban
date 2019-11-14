package dao;
import java.util.*;
import data.*;
public interface IActorDAO {
	public boolean doCreate(Cast vo) throws Exception;
	public boolean doUpdate(Cast vo) throws Exception;
	public boolean doRemove(int id) throws Exception;
	public Cast findById(int id) throws Exception;
	public List<Cast> findByName(String name) throws Exception;
	public List<Movie> Actor_Movie(Cast cast) throws Exception;
}
