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
public class Options {
    int id,categID,groupID,optionGroup,type,extra,myPosition,productID,price;
    String text,kitchenText;
    byte tax,valid;
     java.sql.Timestamp Timestamp ;
     

public Options ()
{
    
}

    public Options(int id, int categID, int groupID, int optionGroup, int type, int extra, int myPosition, int productID, int price, String text, String kitchenText, byte tax, byte valid, Timestamp Timestamp) {
        this.id = id;
        this.categID = categID;
        this.groupID = groupID;
        this.optionGroup = optionGroup;
        this.type = type;
        this.extra = extra;
        this.myPosition = myPosition;
        this.productID = productID;
        this.price = price;
        this.text = text;
        this.kitchenText = kitchenText;
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

    public int getGroupID() {
        return groupID;
    }

    public int getOptionGroup() {
        return optionGroup;
    }

    public int getType() {
        return type;
    }

    public int getExtra() {
        return extra;
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

    public String getText() {
        return text;
    }

    public String getKitchenText() {
        return kitchenText;
    }

    public byte getTax() {
        return tax;
    }

    public byte getValid() {
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

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public void setOptionGroup(int optionGroup) {
        this.optionGroup = optionGroup;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setExtra(int extra) {
        this.extra = extra;
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

    public void setText(String text) {
        this.text = text;
    }

    public void setKitchenText(String kitchenText) {
        this.kitchenText = kitchenText;
    }

    public void setTax(byte tax) {
        this.tax = tax;
    }

    public void setValid(byte valid) {
        this.valid = valid;
    }

    public void setTimestamp(Timestamp Timestamp) {
        this.Timestamp = Timestamp;
    }


     
     
    
}
