/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catalog.services;

/**
 *
 * @author Teoo
 */

import com.mycompany.catalog.models.Categories;
import com.mycompany.catalog.models.Products;
import com.mycompany.catalog.models.Options;
import static com.mycompany.catalog.services.CategoriesServices.JDBC_DRIVER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class OptionsServices {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/orderdb";
    static final String USER = "root";
    static final String PASS = "portadmin";
    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pst= null;
    private ResultSet rs=null;
    private Options option;
    private List<Options> options;

public OptionsServices()
    {
        try {
            Class.forName(JDBC_DRIVER);
            //Άνοιγμα σύνδεσης
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("edw paei");
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Error/Failed to connect  to database. . ."+e);
        }
    }

 public List<Options> getalloptions()
   {
      options = new ArrayList<Options>();
       
      try{
        String sql = "SELECT * FROM options";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) 
        {
           option = new Options();
           option.setId(rs.getInt("id"));
           option.setId(rs.getInt("categID"));
           option.setText(rs.getString("text"));
           option.setKitchenText(rs.getString("kitchenText"));
           option.setGroupID(rs.getInt("groupID"));
           option.setOptionGroup(rs.getInt("optionGroup"));
           option.setType(rs.getInt("type"));
           option.setExtra(rs.getInt("extra"));
           option.setMyPosition(rs.getInt("myPosition"));
           option.setProductID(rs.getInt("productID"));
           option.setPrice(rs.getInt("price"));
           option.setTax(rs.getByte("tax"));
           option.setValid(rs.getByte("valid"));
           option.setTimestamp(rs.getTimestamp("Timestamp"));
           options.add(option);
            
        }
       stmt.close();   
       } 
       catch (Exception ex) 
        {
            System.out.println("Error while loading query ");
        }
       return options;
         
       
   }


}
