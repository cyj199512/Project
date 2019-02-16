/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbDao;

import dao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Richard
 */
public class CsvDbDAO {
    private Connection connection;
   
   
     public Connection getConnection() throws Exception {
          
        try{
            // load the driver into memory
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            // create a connection. The first command line parameter is assumed to
            // be the directory in which the .csv files are held
            connection = DriverManager.getConnection("jdbc:relique:csv:/Users/Richard/Desktop/NEU/6250/" );
            // create a Statement object to execute the query with
        }catch (SQLException ex) {
//            endConnection();
            System.out.println("SQL Exception");
            ex.printStackTrace();
            throw new Exception();
        }
        
        return this.connection;
     }
}
    

