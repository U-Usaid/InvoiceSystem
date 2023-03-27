package src;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class JDBC {
	
	Shop myShop = new Shop();
	
	public void creatShopTable() {
		
		 String url = "jdbc:sqlserver://localhost:1433;databaseName=invoiceSystem;encrypt=true;trustServerCertificate=true";
	        String user = "sa";
	        String pass = "root";
		
	        String sql = "CREATE TABLE Shop " +
                 "("
                 + " ShopName Varchar(50), "
                 + " Telephone  INT,"
                 + " Fax  INT,"
                 + " Email Varchar(50), "
                 + " Website Varchar(50)) ";

     Connection conn = null;
     try {
         Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
         DriverManager.registerDriver(driver);
         conn = DriverManager.getConnection(url, user, pass);
         java.sql.Statement st = conn.createStatement();
         int m = st.executeUpdate(sql);
         
        
         
         if (m >= 1) {
             System.out.println("Created table in given database...");
           
         } else {
             System.out.println(" table already Created in given database...");
         }
         conn.close();
     } catch (Exception ex) {
         System.err.println(ex);
     }
		
	}
	
	
	
	public void creatItemTable() {
		
		 String url = "jdbc:sqlserver://localhost:1433;databaseName=invoiceSystem;encrypt=true;trustServerCertificate=true";
	        String user = "sa";
	        String pass = "root";
		
	        String sql = "CREATE TABLE Item " +
                   "("
                   + " itemID INT, "
                   + " itemName  VARCHAR(50),"
                   + " unitPrice float,"
                   + " quantity INT, "
                   + " qtyAmount float) ";

	        
       Connection conn = null;
       try {
           Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           DriverManager.registerDriver(driver);
           conn = DriverManager.getConnection(url, user, pass);
           java.sql.Statement st = conn.createStatement();
           int m = st.executeUpdate(sql);
           
         
           if (m >= 1) {
               System.out.println("Created table in given database...");
             
           } else {
               System.out.println(" table already Created in given database...");
           }
           conn.close();
       } catch (Exception ex) {
           System.err.println(ex);
       }
		
	}
	
	
	
	
	public void creatInvoiceTable() {
		
		 String url = "jdbc:sqlserver://localhost:1433;databaseName=invoiceSystem;encrypt=true;trustServerCertificate=true";
	        String user = "sa";
	        String pass = "root";
		
	        String sql = "CREATE TABLE Invoice " +
                  "("
                  + " invoiceNo INT, "
                  + " customerName  VARCHAR(50),"
                  + " phoneNo INT,"
                  + " invoiceDate DATE, "
                  + " total float, "
                  + " paidAmount float, "
                  + " balance float) ";



      Connection conn = null;
      try {
          Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
          DriverManager.registerDriver(driver);
          conn = DriverManager.getConnection(url, user, pass);
          java.sql.Statement st = conn.createStatement();
          int m = st.executeUpdate(sql);
          if (m >= 1) {
              System.out.println("Created table in given database...");
            
          } else {
              System.out.println(" table already Created in given database...");
          }
          conn.close();
      } catch (Exception ex) {
          System.err.println(ex);
      }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
