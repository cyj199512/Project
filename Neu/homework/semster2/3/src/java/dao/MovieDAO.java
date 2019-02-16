/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbDao.part7DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pojo.Movie;

/**
 *
 * @author Richard
 */
public class MovieDAO {
    
    public int addMovies(String title, String actor,String actress,String genre,String year) {
        Connection connection = null;
        
        int result = 0;
        try {
            part7DAO p7dao = new part7DAO();
            connection = p7dao.getConnection();
             
            QueryRunner queryRunner = new QueryRunner();
            String query = "INSERT INTO movietable (title, actor, actress, gene, year) VALUES (?,?,?,?,?)";
            
            result = queryRunner.update(connection, query,title, actor, actress, genre, year);
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
    
    public List<Movie> searchMovie(String type, String ob) {
        Connection connection = null;
        List<Movie> result = null;
        try {
            part7DAO dbdao = new part7DAO();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<Movie>> h = new BeanListHandler<Movie>(Movie.class);
            String query = "SELECT * FROM movietable where " + type + "=?";
            result = queryRunner.query(connection, query,h,ob);
            
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
    
}
