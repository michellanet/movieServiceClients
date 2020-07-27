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
import java.util.ArrayList;
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
@WebServlet(name = "Manager", urlPatterns = {"/Manager"})
public class Manager extends HttpServlet {

    MovieAppOpsService movieOpsService;
    MovieAppOps port;

    public Manager() {
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
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
                out.println("<title>Admin Dashboard</title>");
                out.println("<link rel='stylesheet' href= 'https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
                out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
                out.println("</head>");
                out.println("<body class='container'>");

                out.println("<div class='row justify-content-between'>");
                out.println("<div class='col-4'>");
                out.println("<a href='AddVideoView' class='btn btn-primary mt-3'>Add Video</a>");
                out.println("</div>");
                out.println("<div class='col-4'>");
                out.println("<a href='Signout' class='btn btn-danger mt-3'>Sign Out</a>");
                out.println("</div>");
                out.println("</div>");

                //get all videos
                ArrayList<Videos> videos = (ArrayList<Videos>) port.getVideos();

                //display videos from list
                for (int counter = 0; counter < videos.size(); counter++) {
                    out.println("<div class='card border-primary text-center mt-5'>");
                    out.println("<div class='card-header'><h3>" + videos.get(counter).getTitle() + "<h3></div>");
                    out.println("<div class='card-body'>");
                    out.println("<h5 class='card-title'>" + videos.get(counter).getType() + "</h5>");
                    out.println("<p class='card-text'>" + videos.get(counter).getGenre() + "</p>");
                    out.println("<p class='card-text'>"
                            + videos.get(counter).getStarActorFk().getFirstname()
                            + " " + videos.get(counter).getStarActorFk().getLastname() + "</p>");

                    String editVideo = "?title=" + videos.get(counter).getTitle()+"&id="+videos.get(counter).getId();
                    out.println("<a href='EditVideoView" + editVideo + "' class='btn btn-info'>Edit</a>");

                    String deleteVideo = "?title=" + videos.get(counter).getTitle();
                    out.println("<a href='DeleteVideoView" + deleteVideo + "' class='btn btn-danger'>Delete</a>");

                    out.println("</div>");
                    out.println("<div class='card-footer text-muted'>"+videos.get(counter).getYear()+"</div>");
                }

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
