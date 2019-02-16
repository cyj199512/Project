package jspServlet.dao;

import jspServlet.vo.User;

public interface UserDAO {
	public int queryByUsername(User user) throws Exception;
	public int insertUser(User user) throws Exception;
	public int updateUser(User user)throws Exception;
}
