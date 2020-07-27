/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import clients.MovieAppOps;
import clients.MovieAppOpsService;
import clients.StarActor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author michellanet
 */
@WebServlet(name = "AddVideoView", urlPatterns = {"/AddVideoView"})
public class AddVideoView extends HttpServlet {

    MovieAppOpsService movieOpsService;
    MovieAppOps port;
    
    public AddVideoView() {
        movieOpsService = new MovieAppOpsService();
        port = movieOpsService.getMovieAppOpsPort();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (port.isSessionAuthorized()) {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
                out.println("<title>Add Video</title>");
                out.println("<link rel='stylesheet' href= 'https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
                out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class='row justify-content-end mb-4'>");
                out.println("<div class='col-4'>");
                out.println("<h3 class='mb-3'>Add Video</h3>");
                out.println("</div>");
                out.println("<div class='col-4'>");
                out.println("<a href='Signout' class='btn btn-danger mt-3'>Sign Out</a>");
                out.println("</div>");
                out.println("</div>");
                out.println("<div class='container'>");
                out.println("<div class='jumbotron'>");

                
                

                out.println("<form action='AddVideo' method='post' enctype='multipart/form-data'>");

                out.println("<div class='form-group mb-4'>");
                out.println("<label for='title'><strong>Title</strong></label>");
                out.println("<input type='text' class='form-control' name='title' placeholder='Movie title' required='true'>");
                out.println("</div>");

                out.println("<div class='form-group mb-4'>");
                out.println("<label for='genre'><strong>Genre</strong></label>");
                out.println("<input type='text' class='form-control' name='genre' placeholder='Example: Comedy' required='true'>");
                out.println("</div>");
                
                
                out.println("<label><strong>Star Actor</strong></label>");
                
    out.println("<div class='form-group col-md-4'>");
      out.println("<select name='inbuiltActor' class='form-control'>");
        out.println("<option value='other' selected>Other</option>");
        
        ArrayList<StarActor> starActors = (ArrayList<StarActor>) port.getStarActors();
        for (int i=0; i<starActors.size(); i++) {
            out.println("<option value='"+starActors.get(i).getId()+"'>"+starActors.get(i).getFirstname()+" "+starActors.get(i).getLastname()+"</option>");
                }
        
        
      out.println("</select>");
    out.println("</div>");
                

                out.println("<label>If Other is selected. Add Star Actor here</label>");
                out.println("<div class='form-group mb-2'>");
                out.println("<label for='actorFN'>First Name</label>");
                out.println("<input type='text' class='form-control' name='actorFN' placeholder='Example: Jim'>");
                out.println("</div>");
                out.println("<div class='form-group mb-4'>");
                out.println("<label for='actorLN'>Last Name</label>");
                out.println("<input type='text' class='form-control' name='actorLN' placeholder='Example: Carey'>");
                out.println("</div>");

                out.println("<label><strong>Video Type</strong></label>");
                out.println("<div class='form-check'>");
                out.println("<input class='form-check-input' type='radio' name='videoType' id='movie' value='Movie' checked>");
                out.println("<label class='form-check-label' for='movie'>");
                out.println("Movie");
                out.println("</label>");
                out.println("</div>");
                out.println("<div class='form-check mb-4'>");
                out.println("<input class='form-check-input' type='radio' name='videoType' id='show' value='Show'>");
                out.println("<label class='form-check-label' for='show'>");
                out.println("Show");
                out.println("</label>");
                out.println("</div>");

                out.println("<div class='form-group mb-4'>");
                out.println("<label for='year'><strong>Release Year</strong></label>");
                out.println("<input type='text' class='form-control' name='year' style='width:100px' pattern='\\d+' placeholder='Ex: 2020' required='true'>");
                out.println("</div>");

                out.println("<div class='form-group mb-3'>");
                out.println("<label for='upload'><strong>Upload Thumbnail</strong></label>");
                out.println("<input type='file' class='form-control-file' name='upload' required='true'>");
                out.println("</div>");

                out.println("<button type='submit' class='btn btn-success'>Submit</button>");

                out.println("</form>");
                out.println("</div>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
