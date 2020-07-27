/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import serviceClient.MovieAppOps;
import serviceClient.MovieAppOpsService;
import serviceClient.Videos;

/**
 *
 * @author michellanet
 */
@Path("movies")
public class MovieRestOps {
    
    
    MovieAppOpsService movieOpsService;
    MovieAppOps port;

    public MovieRestOps() {
        movieOpsService = new MovieAppOpsService();
        port = movieOpsService.getMovieAppOpsPort();
    }
    
    ///api/movies
    @GET
    @Produces("application/json")
    public Response movies() {
        List<Videos> videosList = port.getVideos();      
                
        
        if (!videosList.isEmpty()) {

            return Response.ok(videosList).build();

        } else {
            return Response.noContent().build();
        }
    }
    
    ///api/movies/{type}
    @Path("{type}")
    @GET
    @Produces("application/json")
    public Response getMoviesByType(@PathParam("type") String type) {
        
        List<Videos> videosList = port.getVideosByType(type);                
        
        if (!videosList.isEmpty()) {

            return Response.ok(videosList).build();

        } else {
            return Response.noContent().build();
        }
    }
}