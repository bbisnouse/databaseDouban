package dao;

import java.util.Date;
import data.*;
import java.util.ArrayList;
import java.util.*;

public interface ITypeDAO {
	public List<Movie> Type_findById(int Type_id) throws Exception;
	public boolean Type_add(String Type_name) throws Exception;
	public boolean Type_del(int Type_id) throws Exception;
	public boolean Type_change(int Type_id,String Type_name) throws Exception;

}
/*
private int type_id;
private String type_name;
*/
