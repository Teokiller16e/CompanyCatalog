/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Teoo
 */
public class Catalog_Client {
    private Client catalog_model;
    
     public Catalog_Client() 
     {
        catalog_model = ClientBuilder.newClient();
    }

  
//User Resources :
    public List<String> GetAllCategoriesNames() {
        catalog_model = ClientBuilder.newClient();
        Response response = catalog_model.target("http://localhost:8080/Catalog/webapi/categories_resource").request(MediaType.APPLICATION_JSON).get();
        List<String> names = response.readEntity(new GenericType<List<String>>() {
        });
        return names;
       
    }
    
   public List<String> GetAllSubCategoriesNames(String categid) {
        catalog_model = ClientBuilder.newClient();
        Response response = catalog_model.target("http://localhost:8080/Catalog/webapi/categories_resource/" + categid).request(MediaType.APPLICATION_JSON).get();
       List<String> names = response.readEntity(new GenericType<List<String>>() {
        });
        return names;
    }
   
   
    public List<String> GetAllSubCategoriesOptions(String categid) {
        catalog_model = ClientBuilder.newClient();
        Response response = catalog_model.target("http://localhost:8080/Catalog/webapi/categories_resource/" + categid).request(MediaType.APPLICATION_JSON).get();
       List<String> names = response.readEntity(new GenericType<List<String>>() {
        });
        return names;
    }
    
     public List<String> GetAllCategoriesProducts(String categid) {
        catalog_model = ClientBuilder.newClient();
        Response response = catalog_model.target("http://localhost:8080/Catalog/webapi/categories_resource/" + categid).request(MediaType.APPLICATION_JSON).get();
       List<String> names = response.readEntity(new GenericType<List<String>>() {
        });
        return names;
    }
    
}
