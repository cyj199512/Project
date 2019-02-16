/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbDao.DbDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pojo.Books;

/**
 *
 * @author Richard
 */
public class BooksDao {
     
    public List<Books> getAll() {
        Connection connection = null;
        List<Books> result = null;
        try {
            DbDao dbdao = new DbDao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<Books>> h = new BeanListHandler<Books>(Books.class);
            String query = "SELECT * FROM books";
            result = queryRunner.query(connection, query,h);
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("SQLException" + ex.getMessage());
            }
        }
        return result;

    }
    
    public List<Books> getBooks(String name) {
        Connection connection = null;
        List<Books> result = null;
        try {
            DbDao dbdao = new DbDao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<Books>> h = new BeanListHandler<Books>(Books.class);
            String query = "SELECT * FROM books where name=?";
            result = queryRunner.query(connection, query,h,name);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("SQLException" + ex.getMessage());
            }
        }
        return result;

    }
    
    
    public int addBooks(String name) {
        Connection connection = null;
        
        int result = 0;
        try {
            DbDao dbdao = new DbDao();
            connection = dbdao.getConnection();
             
            QueryRunner queryRunner = new QueryRunner();
            String query = "INSERT INTO books (name) VALUES (?)";
            
            result = queryRunner.update(connection, query,name);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("SQLException" + ex.getMessage());
            }
        }
        return result;

    }
    public int deleteBooks(String name) {
        Connection connection = null;
        int result = 0;
        try {
            DbDao dbdao = new DbDao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query = "DELETE FROM books WHERE name=?";
           
            result = queryRunner.update(connection, query,name);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("SQLException" + ex.getMessage());
            }
        }
        return result;

    }
    
    
}
