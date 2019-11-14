package dao;
import java.util.*;
import data.*;
public interface IBelongDAO {
	public boolean doCreate(Belong vo) throws Exception;
	public boolean doDelete(Belong vo) throws Exception;
	public List<Movie> doFind_byTypeid(int Type_id) throws Exception;
	public List<Type> doFind_byMovieid(int Movie_id) throws Exception;
}
