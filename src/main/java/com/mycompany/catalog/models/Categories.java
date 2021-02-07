/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catalog.models;

import java.sql.Timestamp;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement

/**
 *
 * @author Teoo
 */
public class Categories {
    
    java.sql.Timestamp Timestamp ;
    byte OKgoesBack,tax,valid;
    int id,printerID,couverMode,subcateg,relatedCategory,listColor,layout0,layout1,layout2,layout3,maxSelection,myPosition,productID,price;
    String name,text,fiscalText,type,priceLoc,ilistText,group1text,group2text,group3text;
   /* DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
   Date date = dateFormat.parse();
   long time = date.getTime();
   new Timestamp(time);
    */

    public Categories(int id, int printerID, int couverMode, byte OKgoesBack, int subcateg, 
            int relatedCategory, int listColor, int layout0, int layout1, int layout2, int layout3, 
            int maxSelection, int myPosition, int productID, int price, byte tax, byte valid, String name, 
            String text, String fiscalText, String type, String priceLoc, String ilistText, String group1text, 
            String group2text, String group3text,java.sql.Timestamp Timestamp)
    {
        this.id = id;
        this.printerID = printerID;
        this.couverMode = couverMode;
        this.OKgoesBack = OKgoesBack;
        this.subcateg = subcateg;
        this.relatedCategory = relatedCategory;
        this.listColor = listColor;
        this.layout0 = layout0;
        this.layout1 = layout1;
        this.layout2 = layout2;
        this.layout3 = layout3;
        this.maxSelection = maxSelection;
        this.myPosition = myPosition;
        this.productID = productID;
        this.price = price;
        this.tax = tax;
        this.valid = valid;
        this.name = name;
        this.text = text;
        this.fiscalText = fiscalText;
        this.type = type;
        this.priceLoc = priceLoc;
        this.ilistText = ilistText;
        this.group1text = group1text;
        this.group2text = group2text;
        this.group3text = group3text;
        this.Timestamp = Timestamp;
    }

 public Categories()
 {
     
 }

    public int getId() {
        return id;
    }

    public int getPrinterID() {
        return printerID;
    }

    public int getCouverMode() {
        return couverMode;
    }

    public byte getOKgoesBack() {
        return OKgoesBack;
    }

    public int getSubcateg() {
        return subcateg;
    }

    public int getRelatedCategory() {
        return relatedCategory;
    }

    public int getListColor() {
        return listColor;
    }

    public int getLayout0() {
        return layout0;
    }

    public int getLayout1() {
        return layout1;
    }

    public int getLayout2() {
        return layout2;
    }

    public int getLayout3() {
        return layout3;
    }

    public int getMaxSelection() {
        return maxSelection;
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

    public byte getTax() {
        return tax;
    }

    public byte getValid() {
        return valid;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getFiscalText() {
        return fiscalText;
    }

    public String getType() {
        return type;
    }

    public String getPriceLoc() {
        return priceLoc;
    }

    public String getIlistText() {
        return ilistText;
    }

    public String getGroup1text() {
        return group1text;
    }

    public String getGroup2text() {
        return group2text;
    }

    public String getGroup3text() {
        return group3text;
    }

    
      public Timestamp getTime() {
        return Timestamp;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setPrinterID(int printerID) {
        this.printerID = printerID;
    }

    public void setCouverMode(int couverMode) {
        this.couverMode = couverMode;
    }

    public void setOKgoesBack(byte OKgoesBack) {
        this.OKgoesBack = OKgoesBack;
    }

    public void setSubcateg(int subcateg) {
        this.subcateg = subcateg;
    }

    public void setRelatedCategory(int relatedCategory) {
        this.relatedCategory = relatedCategory;
    }

    public void setListColor(int listColor) {
        this.listColor = listColor;
    }

    public void setLayout0(int layout0) {
        this.layout0 = layout0;
    }

    public void setLayout1(int layout1) {
        this.layout1 = layout1;
    }

    public void setLayout2(int layout2) {
        this.layout2 = layout2;
    }

    public void setLayout3(int layout3) {
        this.layout3 = layout3;
    }

    public void setMaxSelection(int maxSelection) {
        this.maxSelection = maxSelection;
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

    public void setTax(byte tax) {
        this.tax = tax;
    }

    public void setValid(byte valid) {
        this.valid = valid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFiscalText(String fiscalText) {
        this.fiscalText = fiscalText;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPriceLoc(String priceLoc) {
        this.priceLoc = priceLoc;
    }

    public void setIlistText(String ilistText) {
        this.ilistText = ilistText;
    }

    public void setGroup1text(String group1text) {
        this.group1text = group1text;
    }

    public void setGroup2text(String group2text) {
        this.group2text = group2text;
    }

    public void setGroup3text(String group3text) {
        this.group3text = group3text;
    }

  

    public void setTime(Timestamp Timestamp) {
        this.Timestamp = Timestamp;
    }
 
 
    
}
