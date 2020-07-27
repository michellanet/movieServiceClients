/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import clients.MovieAppOps;
import clients.MovieAppOpsService;
import clients.Videos;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DeleteVideoView", urlPatterns = {"/DeleteVideoView"})
public class DeleteVideoView extends HttpServlet {

    MovieAppOpsService movieOpsService;
    MovieAppOps port;
    String title;

    public DeleteVideoView() {
        movieOpsService = new MovieAppOpsService();
        port = movieOpsService.getMovieAppOpsPort();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (port.isSessionAuthorized()) {
            String title = request.getParameter("title");
            Videos video = port.getVideo(title);
            title = video.getTitle();

            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
                out.println("<title>Admin Dashboard</title>");
                out.println("<link rel='stylesheet' href= 'https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
                out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class='row justify-content-end mb-4'>");
                out.println("<div class='col-4'>");
                out.println("<h3 class='mb-3'>Delete Video</h3>");
                out.println("</div>");
                out.println("<div class='col-4'>");
                out.println("<a href='Signout' class='btn btn-danger mt-3'>Sign Out</a>");
                out.println("</div>");
                out.println("</div>");
                out.println("<div class='container alert alert-warning'>");
                
                

                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label'>Are you sure you want to delete?</label>");
                out.println("</div>");

                out.println("<div class='form-group row'>");
                out.println("<a href='Manager' type='submit' class='btn btn-info mr-3'>Cancel</a>");

                String deleteVideo = "?title=" + title;
                out.println("<a href='DeleteVideo" + deleteVideo + "' type='submit' class='btn btn-danger'>OK</a>");
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
