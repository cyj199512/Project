package jspServlet.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





import jspServlet.dao.CartDAO;
import jspServlet.dao.UserDAO;
import jspServlet.db.DBConnect;
import jspServlet.vo.Cart;
import jspServlet.vo.Product;
import jspServlet.vo.User;

public class CartDAOImpl implements CartDAO {

	public int addCart(int pid, String uname) {
		int i = 0;
		String sql = "insert into cart(pid,uname)values("+pid+",'"+uname+"')";
		PreparedStatement pstmt=null;
		DBConnect dbc=null;
		try{
			//获取连接
			dbc=new DBConnect();
			pstmt=dbc.getConnection().prepareStatement(sql);
			i = pstmt.executeUpdate();
			System.out.print(i);
			pstmt.close();
		}catch (SQLException e){
			System.out.println(e.getMessage());
			
		}finally{
			dbc.close();
		}
		return i;
	}
	
	
	public int deleteCart(int id) {
		int i = 0;
		String sql = "delete from cart where id ="+id;
		PreparedStatement pstmt=null;
		DBConnect dbc=null;
		try{
			//获取连接
			dbc=new DBConnect();
			pstmt=dbc.getConnection().prepareStatement(sql);
			i = pstmt.executeUpdate();
			pstmt.close();
		}catch (SQLException e){
			System.out.println(e.getMessage());
			
		}finally{
			dbc.close();
		}
		return i;
	}
	


	public List<Cart> myCart(String uname)
	{
		List<Cart> list = new ArrayList<Cart>();
		String sql = "select a.id,b.path,b.name,b.price,b.state from cart a,product b where a.pid = b.id and a.uname = '"+uname+"'";
		PreparedStatement pstmt=null;
		DBConnect dbc=null;
		try{
			//获取连接
			dbc=new DBConnect();
			pstmt=dbc.getConnection().prepareStatement(sql);
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()){
				Cart rec=new Cart();
                rec.setId(rs.getInt(1));
                rec.setPath(rs.getString(2));
               rec.setPname(rs.getString(3));
               rec.setPrice(rs.getString(4));
               rec.setState(rs.getString(5));
               list.add(rec);
			}
			rs.close();
			pstmt.close();
		}catch (SQLException e){
			System.out.println(e.getMessage());
			
		}finally{
			dbc.close();
		}
		return list;
	}
	
	public int myCartCount(String uname)
	{
		String sql = "select count(*) from cart where uname = '"+uname+"'";
		PreparedStatement pstmt=null;
		int count = 0;
		DBConnect dbc=null;
		try{
			//获取连接
			dbc=new DBConnect();
			pstmt=dbc.getConnection().prepareStatement(sql);
			
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()){
				count = rs.getInt(1);
			}
			rs.close();
			pstmt.close();
		}catch (SQLException e){
			System.out.println(e.getMessage());
			
		}finally{
			dbc.close();
		}
		return count;
	}
}
