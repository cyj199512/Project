package jspServlet.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





import jspServlet.dao.UserDAO;
import jspServlet.db.DBConnect;
import jspServlet.vo.User;

public class UserDAOImpl implements UserDAO {

	public int queryByUsername(User user) throws Exception {
		// TODO Auto-generated method stub
		int flag=0;
		String sql="select * from user where username=? and password=?";
		PreparedStatement pstmt=null;
		DBConnect dbc=null;
		
		try{
			//获取连接
			dbc=new DBConnect();
			pstmt=dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1,user.getUsername());
			pstmt.setString(2,user.getPassword());
			//��ݿ����
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()){
			
				++flag;     
			}
			rs.close();
			pstmt.close();
		}catch (SQLException e){
			System.out.println(e.getMessage());
			
		}finally{
			dbc.close();
		}
		
		return flag;
	}
	

	public static void main(String[] args){
		User user = new User();
		user.setUsername("cuiyaji");
		user.setPassword("123");
		UserDAOImpl impl = new UserDAOImpl();
		int abc;
		try {
			abc = impl.queryByUsername(user);
			System.out.print(abc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int updateUser(User user) throws Exception {
				int flag=0;
				String sql="update user set password=? where username=?";
				PreparedStatement pstmt=null;
				DBConnect dbc=null;
				
				try{
					//获取连接
					dbc=new DBConnect();
					pstmt=dbc.getConnection().prepareStatement(sql);
					pstmt.setString(1,user.getPassword());
					pstmt.setString(2,user.getUsername());
					
					
					flag = pstmt.executeUpdate();
					pstmt.close();
				}catch (SQLException e){
					System.out.println(e.getMessage());
					
				}finally{
					dbc.close();
				}
				
				return flag;
	}
	

	public int insertUser(User user) throws Exception {
				int flag=0;
				String sql="insert into user (username,password,email) values(?,?,?)";
				PreparedStatement pstmt=null;
				DBConnect dbc=null;
				
				try{
					//获取连接
					dbc=new DBConnect();
					pstmt=dbc.getConnection().prepareStatement(sql);
					pstmt.setString(1,user.getUsername());
					pstmt.setString(2,user.getPassword());
					pstmt.setString(3,user.getEmail());
					flag = pstmt.executeUpdate();
					pstmt.close();
				}catch (SQLException e){
					System.out.println(e.getMessage());
					
				}finally{
					dbc.close();
				}
				
				return flag;
	}


}
