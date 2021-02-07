/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catalog.services;

import com.mycompany.catalog.models.Categories;
import com.mycompany.catalog.models.Products;
import com.mycompany.catalog.models.Options;
import static com.mycompany.catalog.services.CategoriesServices.JDBC_DRIVER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
/**
 *
 * @author Teoo
 */
public class ProductsServices {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/orderdb";
    static final String USER = "root";
    static final String PASS = "portadmin";
    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pst= null;
    private ResultSet rs=null;
    private Products product;
    private List<Products> products;
    
    public ProductsServices()
    {
        try {
            Class.forName(JDBC_DRIVER);
            //Άνοιγμα σύνδεσης
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("edw paei");
        } catch (Exception e) {
            
            System.out.println("Error/Failed to connect  to database. . .");
        }
    }
    
     public List<Products> getallproducts()
   {
      products = new ArrayList<Products>();
       
      try{
        String sql = "SELECT * FROM products";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) 
        {
           product = new Products();
           product.setId(rs.getInt("id"));
           product.setId(rs.getInt("categID"));
           product.setName(rs.getString("name"));
           product.setKitchenText(rs.getString("kitchenText"));
           product.setMyPosition(rs.getInt("myPosition"));
           product.setProductID(rs.getInt("productID"));
           product.setPrice(rs.getInt("price"));
           product.setTax(rs.getByte("tax"));
           product.setValid(rs.getByte("valid"));
           product.setInstock(rs.getInt("instock"));
           product.setInreserve(rs.getInt("inreserve"));
           product.setBarcode(rs.getString("barcode"));
           product.setProductcode(rs.getString("productcode"));
           product.setSuprodcode(rs.getString("suprodcode"));
           product.setTimestamp(rs.getTimestamp("Timestamp"));
           products.add(product);
            
        }
       stmt.close();   
       } 
       catch (Exception ex) 
        {
            System.out.println("Error while loading query ");
        }
       return products;
         
       
   }
}
