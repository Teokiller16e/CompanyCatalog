/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catalog.resources;

import com.mycompany.catalog.models.Categories;
import com.mycompany.catalog.services.CategoriesServices;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Teoo
 */

@XmlRootElement

@Path("categories_resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Categories_Resource {
    private CategoriesServices catser = new CategoriesServices();
    
    public Categories_Resource ()
    {
        
    }
    
    
    
    @GET
    public List<String> GetAllCategoriesNames ()
    {
        return catser.GetAllCategoriesNames();
    }
       
    @GET
    @Path("/{id}")
    public List GetAllSubCategoriesNames (@PathParam("id") int id)
    {
        return catser.GetAllSubCategoriesNames(id);
    }
    
    @GET
    @Path("/{id}")
    public List GetAllSubCategoriesOptions (@PathParam("id") int id)
    {
        return catser.GetAllCategoriesOptions(id);
    }
    
    @GET
    @Path("/{id}")
    public List GetAllCategoriesProducts (@PathParam("id") int id)
    {
        return catser.GetAllCategoriesProducts(id);
    }
}
