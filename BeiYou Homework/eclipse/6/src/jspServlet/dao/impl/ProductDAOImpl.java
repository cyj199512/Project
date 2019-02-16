package jspServlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jspServlet.dao.ProductDAO;
import jspServlet.dao.UserDAO;
import jspServlet.db.DBConnect;
import jspServlet.vo.Product;

public class ProductDAOImpl  implements ProductDAO {

	public ArrayList<Product> queryProduct() throws Exception {
		
		String sql="select * from product";
		PreparedStatement pstmt=null;
		DBConnect dbc=null;
		ArrayList<Product> productList = new ArrayList<Product> ();
		try{
			//获取连接
			dbc=new DBConnect();
			pstmt=dbc.getConnection().prepareStatement(sql);
			
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()){
				Product rec=new Product();
                rec.setId(rs.getString(1));
                rec.setPath(rs.getString(2));
               rec.setName(rs.getString(3));
               rec.setIntroduce(rs.getString(4));
               rec.setPrice(rs.getString(5));
               productList.add(rec);
				   
			}
			rs.close();
			pstmt.close();
		}catch (SQLException e){
			System.out.println(e.getMessage());
			
		}finally{
			dbc.close();
		}
		
		return productList;
	}
	
	
public Product queryProduct(String id) throws Exception {
		
		String sql="select * from product where id=?";
		PreparedStatement pstmt=null;
		DBConnect dbc=null;
		Product rec=new Product();
		try{
			//获取连接
			dbc=new DBConnect();
			pstmt=dbc.getConnection().prepareStatement(sql);
			
			pstmt.setString(1, id);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()){
				
                rec.setId(rs.getString(1));
                rec.setPath(rs.getString(2));
               rec.setName(rs.getString(3));
               rec.setIntroduce(rs.getString(4));
               rec.setPrice(rs.getString(5));

			}
			rs.close();
			pstmt.close();
		}catch (SQLException e){
			System.out.println(e.getMessage());
			
		}finally{
			dbc.close();
		}
		
		return rec;
	}
	
	
	

}
