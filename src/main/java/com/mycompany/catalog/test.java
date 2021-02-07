/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catalog;

import com.mycompany.catalog.models.Categories;
import com.mycompany.catalog.services.CategoriesServices;
import com.mycompany.client.Catalog_Client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Teoo
 */
public class test {
    public static void main (String [] args)
    {
    //CategoriesServices cs = new CategoriesServices();
    Catalog_Client clnt = new Catalog_Client();
    List<String> lis = new ArrayList<String>();
     lis=clnt.GetAllCategoriesNames();
    int a=1;
     Categories c = new Categories();
    

    for(String s : lis)
    {
        System.out.println("Onoma :   "+s);
    }
    
    }
}
