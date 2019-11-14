package dao;
import java.util.*;
import data.*;
public interface ITopicDAO {
	public boolean doCreate(Topic vo) throws Exception;
	public boolean doUpdate(Topic vo) throws Exception;
	public boolean doRemove(int id) throws Exception;
	public Topic findById(int id) throws Exception;
}