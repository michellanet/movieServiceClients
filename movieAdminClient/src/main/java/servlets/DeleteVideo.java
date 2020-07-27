/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import clients.MovieAppOps;
import clients.MovieAppOpsService;
import clients.NonexistentEntityException_Exception;
import clients.Videos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "DeleteVideo", urlPatterns = {"/DeleteVideo"})
public class DeleteVideo extends HttpServlet {

    MovieAppOpsService movieOpsService;
    MovieAppOps port;

    public DeleteVideo() {
        movieOpsService = new MovieAppOpsService();
        port = movieOpsService.getMovieAppOpsPort();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NonexistentEntityException_Exception {

        if (port.isSessionAuthorized()) {
            String title = request.getParameter("title");
            Videos video = port.getVideo(title);
            port.deleteVideo(video.getTitle());

            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet DeleteVideo</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet DeleteVideo at " + request.getContextPath() + "</h1>");
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
        try {
            processRequest(request, response);
        } catch (NonexistentEntityException_Exception ex) {
            Logger.getLogger(DeleteVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (NonexistentEntityException_Exception ex) {
            Logger.getLogger(DeleteVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
