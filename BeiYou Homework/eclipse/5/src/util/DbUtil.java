package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.DatabaseMetaData;
import com.mysql.jdbc.Statement;

import common.Common;
import excel.vo.Data;



public class DbUtil {
	
	public static void create(String name) throws SQLException{
		Connection conn = null;
		ResultSet rs;
		Statement stmt = null;
		String sql = "CREATE TABLE " + name +
                "(data VARCHAR(254))"; 
		boolean flag1 = false ;
		
		try {

			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL, Common.USERNAME, Common.PASSWORD);
			DatabaseMetaData meta = (DatabaseMetaData) conn.getMetaData();
			String type [] = {"TABLE"};
			rs = meta.getTables(null, null, name, type);  
            flag1 = rs.next();
			if(flag1==false){
				stmt = (Statement) conn.createStatement();
				stmt.executeUpdate(sql);
			    System.out.println("Created table in given database...");
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		
	}

	public static void insert(String sql, String data) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL, Common.USERNAME, Common.PASSWORD);
			ps = conn.prepareStatement(sql);
			ps.setString(1, data);

			boolean flag = ps.execute();
			if(!flag){
				System.out.println(" succeed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public static List selectOne(String sql, Data data) throws SQLException {
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		List list = new ArrayList();
//		try {
//			Class.forName(Common.DRIVER);
//			conn = DriverManager.getConnection(Common.URL, Common.USERNAME, Common.PASSWORD);
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
//			while(rs.next()){
//				if(rs.getString("no").equals(data.getNo()) || rs.getString("name").equals(data.getName())){
//					list.add(1);
//				}else{
//					list.add(0);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (rs != null) {
//				rs.close();
//			}
//			if (ps != null) {
//				ps.close();
//			}
//			if (conn != null) {
//				conn.close();
//			}
//		}
//		return list;
//	}
//	
	
	public static ResultSet selectAll(String sql) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(Common.DRIVER);
			conn = DriverManager.getConnection(Common.URL, Common.USERNAME, Common.PASSWORD);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return rs;
	}

}
