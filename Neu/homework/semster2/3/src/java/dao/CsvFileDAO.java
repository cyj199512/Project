/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import dbDao.CsvDbDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.CsvFile;

/**
 *
 * @author Richard
 */
public class CsvFileDAO {
    
    public List<CsvFile> getCsvFile(String csvName){
        List<CsvFile> ll = new ArrayList<>();
        CsvDbDAO csvDao = new CsvDbDAO();
        try {
            Connection conn = csvDao.getConnection();
            Statement stmt = conn.createStatement();
            // Select the ID and NAME columns from sample.csv
            ResultSet results = stmt.executeQuery("SELECT * FROM " +csvName );
            ll = ResultSetToList(results);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return ll;
    }
    
     public static List<CsvFile> ResultSetToList(ResultSet rs) {
         

        try {

            ResultSetMetaData md = rs.getMetaData();    // 获得结果集结构信息（字段数、字段名等）

            int columnCount = md.getColumnCount();

            List<CsvFile> list = new ArrayList<>();

            while (rs.next()) {

                CsvFile csv = new CsvFile();

                for (int i = 1; i <= columnCount; i++) {
                    if(md.getColumnName(i).equals("SalesOrderID")){
                         csv.setSalesOrderID(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("RevisionNumber")){
                         csv.setRevisionNumber(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("OrderDate")){
                         csv.setOrderDate(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("DueDate")){
                         csv.setDueDate(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("ShipDate")){
                         csv.setShipDate(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("Status")){
                         csv.setStatus(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("OnlineOrderFlag")){
                         csv.setOnlineOrderFlag(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("SalesOrderNumber")){
                         csv.setSalesOrderNumber(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("urchaseOrderNumber")){
                         csv.setPurchaseOrderNumber(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("AccountNumber")){
                         csv.setAccountNumber(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("CustomerID")){
                         csv.setCustomerID(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("SalesPersonID")){
                         csv.setSalesPersonID(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("TerritoryID")){
                         csv.setTerritoryID(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("BillToAddressID")){
                         csv.setBillToAddressID(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("ShipToAddressID")){
                         csv.setShipToAddressID(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("ShipMethodID")){
                         csv.setShipMethodID(Integer.parseInt(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("CreditCardID")){
                         csv.setCreditCardID(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("CreditCardApprovalCode")){
                         csv.setCreditCardApprovalCode(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("CurrencyRateID")){
                         csv.setCurrencyRateID(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("SubTotal")){
                         csv.setSubTotal(Float.parseFloat(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("TaxAmt")){
                         csv.setTaxAmt(Float.parseFloat(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("Freight")){
                         csv.setFreight(Float.parseFloat(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("TotalDue")){
                         csv.setTotalDue(Float.parseFloat(String.valueOf(rs.getObject(i))));
                    }else if(md.getColumnName(i).equals("Comment")){
                         csv.setComment(String.valueOf(rs.getObject(i)));
                    }else if(md.getColumnName(i).equals("ModifiedDate")){
                         csv.setModifiedDate(String.valueOf(rs.getObject(i)));
                    }
   

                }

                list.add(csv);

            }

            return list;

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return null;

    }
    
}
