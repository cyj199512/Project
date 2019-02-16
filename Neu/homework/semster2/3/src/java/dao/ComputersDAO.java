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
import pojo.Computers;

/**
 *
 * @author Richard
 */
public class ComputersDAO {
    public List<Computers> getAll() {
        Connection connection = null;
        List<Computers> result = null;
        try {
            DbDao dbdao = new DbDao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<Computers>> h = new BeanListHandler<Computers>(Computers.class);
            String query = "SELECT * FROM computers";
            result = queryRunner.query(connection, query,h);
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
    public List<Computers> getComputers(String name) {
        Connection connection = null;
        List<Computers> result = null;
        try {
            DbDao dbdao = new DbDao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<Computers>> h = new BeanListHandler<Computers>(Computers.class);
            String query = "SELECT * FROM computers where name=?";
            result = queryRunner.query(connection, query, h, name);
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
    
    
    public int addComputers(String name) {
        Connection connection = null;
        int result = 0;
        try {
            DbDao dbdao = new DbDao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query = "INSERT INTO computers (name) VALUES (?)";
            Object[] params = {name};
            result = queryRunner.update(connection, query,params);
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
    public int deleteComputers(String name) {
        Connection connection = null;
        int result = 0;
        try {
            DbDao dbdao = new DbDao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query = "DELETE FROM computers WHERE name=?";
           
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
