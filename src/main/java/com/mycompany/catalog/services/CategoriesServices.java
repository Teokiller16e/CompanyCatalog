/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catalog.services;

import com.mycompany.catalog.models.Categories;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Teoo
 */

@XmlRootElement

public class CategoriesServices {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/orderdb";
    static final String USER = "root";
    static final String PASS = "portadmin";
    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pst= null;
    private ResultSet rs=null;
    private Categories category;
    private List<Categories> categories;
    private List<String> categoriesnames;
    private String test,test1;


 public CategoriesServices()
    {
        try {
            Class.forName(JDBC_DRIVER);
            //Άνοιγμα σύνδεσης
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
          
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Error/Failed to connect  to database. . .   --->"+e);
        }
    }
 
 //To service pou epistrefei ta names olwn twn kathgoriwn pou den einai ypokathgories 
  public List<String> GetAllCategoriesNames ()
 {
 categoriesnames = new ArrayList<String>();
 
  try{
        String sql = "SELECT name FROM categories WHERE relatedCategory=0";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) 
        {
           test=rs.getString("name");
           categoriesnames.add(test);
        }
       stmt.close();   
       } 
       catch (Exception ex) 
        {
            System.out.println("Error while loading query ");
        }
       return categoriesnames;
        
   }
  
  //To service pou emfanizei tis kathgories pou einai ypokathgories
 public List<String> GetAllSubCategoriesNames(int id)
 {
     categoriesnames = new ArrayList<String>();
    try{
        String sql = "SELECT name FROM categories WHERE relatedCategory=?";
         pst=conn.prepareStatement(sql);
         pst.setInt(1, id);
         rs=pst.executeQuery();
   
        while (rs.next()) 
        {
           test=rs.getString("name");
           categoriesnames.add(test);
        }
       pst.close();
       rs.close();
       } 
       catch (Exception ex) 
        {
            System.out.println("Error while loading query ");
        }
       return categoriesnames;     
 }
  
 //To service pou mou emfanizei ta options mias kathgorias
 public List<String> GetAllCategoriesOptions(int id)
 {
     
        categoriesnames=new ArrayList<String>();
       try{
             
        String sql = "SELECT  options.text FROM options,categories WHERE categories.ID=? AND options.categID=categories.ID";
           pst=conn.prepareStatement(sql);
           pst.setInt(1, id);
           
           rs=pst.executeQuery();
           System.out.println("troll");
           while (rs.next()) 
        {
            test=rs.getString("text");
            categoriesnames.add(test);
        }
        pst.close();
        rs.close();
       }
       catch (Exception ex) 
       {
        System.out.println("Error Loading");
       }
       return categoriesnames; 
   }
 
 //To service pou mou emfanizei tou products ths kathgorias
 public List<String> GetAllCategoriesProducts(int id)
 {
     
        categoriesnames=new ArrayList<String>();
       try{
             
        String sql = "SELECT  products.name FROM products,categories WHERE categories.ID=? AND products.categID=categories.ID";
           pst=conn.prepareStatement(sql);
           pst.setInt(1, id);
           rs=pst.executeQuery();
           while (rs.next()) 
        {
            test=rs.getString("name");
            categoriesnames.add(test);
        }
        pst.close();
        rs.close();
       }
       catch (Exception ex) 
       {
        System.out.println("Error Loading");
       }
       return categoriesnames; 
   }
 
 //To service pou mou emfanizei products F-TYPE(products & options)
 public List<String> getAllCategoriesProductsOptions(int id)
         {
             categoriesnames=new ArrayList<String>();
             try
             {
                 String sql ="SELECT products.name*,options.text* FROM products,options,categories WHERE categories.ID=? AND products.categID=categories.ID"
                         + "AND options.categID=categories.ID";
              pst=conn.prepareStatement(sql);
              pst.setInt(1, id);
              rs=pst.executeQuery();
             while (rs.next()) 
             {
            test=rs.getString("name");
            test1=rs.getString("text");
            categoriesnames.add(test);
            categoriesnames.add(test1);
             }
             pst.close();
             rs.close();
             }
             catch(Exception ex)
             {
                        System.out.println("Error Loading");

             }
             return categoriesnames;
         }
 
 
 
   public List<Categories> getallcategories()
   {
      categories = new ArrayList<Categories>();
       
      try{
        String sql = "SELECT * FROM categories";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) 
        {
           category = new Categories();
           category.setId(rs.getInt("id"));
           category.setPrinterID(rs.getInt("printerID"));
           category.setCouverMode(rs.getInt("couverMode"));
           category.setOKgoesBack(rs.getByte("OKgoesBack"));
           category.setSubcateg(rs.getInt("subcateg"));
           category.setName(rs.getString("name"));
           category.setText(rs.getString("text"));
           category.setFiscalText(rs.getString("fiscalText"));
           category.setType(rs.getString("type"));
           category.setRelatedCategory(rs.getInt("relatedCategory"));
           category.setPriceLoc(rs.getString("priceLoc"));
           category.setListColor(rs.getInt("listColor"));
           category.setLayout0(rs.getInt("layout0"));
           category.setLayout1(rs.getInt("layout1"));
           category.setLayout2(rs.getInt("layout2"));
           category.setLayout3(rs.getInt("layout3"));
           category.setMaxSelection(rs.getInt("maxSelection"));
           category.setIlistText(rs.getString("ilistText"));
           category.setGroup1text(rs.getString("group1text"));
           category.setGroup2text(rs.getString("group2text"));
           category.setGroup3text(rs.getString("group3text"));
           category.setMyPosition(rs.getInt("myPosition"));
           category.setProductID(rs.getInt("productID"));
           category.setPrice(rs.getInt("price"));
           category.setTax(rs.getByte("tax"));
           category.setValid(rs.getByte("valid"));
           category.setTime(rs.getTimestamp("Timestamp"));
           categories.add(category);
            
        }
       stmt.close();   
       } 
       catch (Exception ex) 
        {
            System.out.println("Error while loading query ");
        }
       return categories;
         
       
   }
   
   public void addCategory(Categories category)
   {
     
       try
       {
           String sql="INSERT INTO categories (printerID,couverMode,OKgoesBack,subcateg,name,text,fiscalText,type,relatedCategory,priceLoc,listColor,"
                   +"layout0,layout1,layout2,layout3,maxSelection,ilistText,group1text,group2text,group3text,myPosition,productID,price,tax,valid,Timestamp) VALUES "
                   + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           
          
           pst= conn.prepareStatement(sql);
          
          
           pst.setInt(1,category.getPrinterID());
           pst.setInt(2,category.getCouverMode());
           pst.setByte(3, category.getOKgoesBack());
           pst.setInt(4,category.getSubcateg());
           pst.setString(5,category.getName());
           pst.setString(6,category.getText());
           pst.setString(7,category.getFiscalText());
           pst.setString(8,category.getType());
           pst.setInt(9,category.getRelatedCategory());
           pst.setString(10,category.getPriceLoc());
           pst.setInt(11,category.getListColor());
           pst.setInt(12,category.getLayout0());
           pst.setInt(13,category.getLayout1());
           pst.setInt(14,category.getLayout2());
           pst.setInt(15,category.getLayout3());
           pst.setInt(16,category.getMaxSelection());
           pst.setString(17,category.getIlistText());
           pst.setString(18,category.getGroup1text());
           pst.setString(19,category.getGroup2text());
           pst.setString(20,category.getGroup3text());
           pst.setInt(21,category.getMyPosition());
           pst.setInt(22,category.getProductID());
           pst.setInt(23,category.getPrice());
           pst.setByte(24,category.getTax());
           pst.setByte(25,category.getValid());
           pst.setTimestamp(26,category.getTime());
           pst.executeUpdate(); 
           pst.close();
       }
       catch(Exception e)
       {
        System.out.println("Error while loading");
       }
       
   }
   
   
    public  void  deleteCustomer(int  id)
  {
      try
      {
          String sql="DELETE  FROM categories WHERE id=?";
          pst = conn.prepareStatement(sql);
          pst.setInt(1, id);
          pst.executeUpdate();
          pst.close();
      }
      
      catch(Exception e)
      {
            System.out.println("Error while loading");
      }
    
}
   
}
