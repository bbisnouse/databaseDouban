package dao;
import data.*;
public interface IMovieandCastDAO {
	public boolean doCreate(MovieandCast vo) throws Exception;
	public boolean doUpdate(MovieandCast vo) throws Exception;
}
