/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catalog.models;

import java.sql.Timestamp;

/**
 *
 * @author Teoo
 */
public class Products {
      int id,categID,myPosition,productID,price,instock,inreserve;
      String name,kitchenText,barcode,productcode,suprodcode;
      Byte tax,valid;
      java.sql.Timestamp Timestamp ;
      
      
      public Products ()
      {
          
      }

    public Products(int id, int categID, int myPosition, int productID, int price, int instock, int inreserve, String name, String kitchenText, String barcode, String productcode, String suprodcode, Byte tax, Byte valid, Timestamp Timestamp) {
        this.id = id;
        this.categID = categID;
        this.myPosition = myPosition;
        this.productID = productID;
        this.price = price;
        this.instock = instock;
        this.inreserve = inreserve;
        this.name = name;
        this.kitchenText = kitchenText;
        this.barcode = barcode;
        this.productcode = productcode;
        this.suprodcode = suprodcode;
        this.tax = tax;
        this.valid = valid;
        this.Timestamp = Timestamp;
    }

    public int getId() {
        return id;
    }

    public int getCategID() {
        return categID;
    }

    public int getMyPosition() {
        return myPosition;
    }

    public int getProductID() {
        return productID;
    }

    public int getPrice() {
        return price;
    }

    public int getInstock() {
        return instock;
    }

    public int getInreserve() {
        return inreserve;
    }

    public String getName() {
        return name;
    }

    public String getKitchenText() {
        return kitchenText;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getProductcode() {
        return productcode;
    }

    public String getSuprodcode() {
        return suprodcode;
    }

    public Byte getTax() {
        return tax;
    }

    public Byte getValid() {
        return valid;
    }

    public Timestamp getTimestamp() {
        return Timestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategID(int categID) {
        this.categID = categID;
    }

    public void setMyPosition(int myPosition) {
        this.myPosition = myPosition;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInstock(int instock) {
        this.instock = instock;
    }

    public void setInreserve(int inreserve) {
        this.inreserve = inreserve;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKitchenText(String kitchenText) {
        this.kitchenText = kitchenText;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public void setSuprodcode(String suprodcode) {
        this.suprodcode = suprodcode;
    }

    public void setTax(Byte tax) {
        this.tax = tax;
    }

    public void setValid(Byte valid) {
        this.valid = valid;
    }

    public void setTimestamp(Timestamp Timestamp) {
        this.Timestamp = Timestamp;
    }
      
      
    
}
