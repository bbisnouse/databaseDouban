package dao;

import data.*;
import java.util.*;

public interface IUserDAO {
	public User findInfoByid(int user_id) throws Exception;
	public boolean finByName(String user_name,String user_password) throws Exception;
	public boolean finByPhone(String user_phone,String user_password) throws Exception;
	public boolean finByEmail(String user_email,String user_password) throws Exception;
	public User findInfoByName(String user_name) throws Exception;
	public boolean doUpdate(User newinfo) throws Exception;
	public boolean doCreate_login(User user)throws Exception;
	public boolean doCreate_detail(User user)throws Exception;
	public boolean doRemove(int user_id)throws Exception;
	public List<Integer> dofind_byuserid(int user_id)throws Exception;
}
