package dao;
import java.util.*;
import data.*;
public interface ICommenceDAO {
	public boolean doCreate(Commence vo) throws Exception;
	public boolean doUpdate(Commence vo) throws Exception;
	public boolean doRemove(int id) throws Exception;
	public Commence findById(int id) throws Exception;
}
