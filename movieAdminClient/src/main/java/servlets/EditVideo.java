/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import clients.Exception_Exception;
import clients.MovieAppOps;
import clients.MovieAppOpsService;
import clients.StarActor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.MTOM;
import javax.xml.ws.soap.MTOMFeature;
import javax.xml.ws.soap.SOAPBinding;

/**
 *
 * @author michellanet
 */
@MTOM(enabled=true, threshold=1)
@WebServlet(name = "EditVideo", urlPatterns = {"/EditVideo"})
@MultipartConfig
public class EditVideo extends HttpServlet {

    MovieAppOpsService movieOpsService;
    MovieAppOps port;
    
    String title;
    String genre;
    String actorFN;
    String actorLN;
    String videoType;
    String year;
    int yearToInt;
    String thumbnail;
    String inbuiltActor;
    StarActor starActor;
    BigDecimal id;

    public EditVideo() {
        movieOpsService = new MovieAppOpsService();
        port = movieOpsService.getMovieAppOpsPort(new MTOMFeature());
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        
        if (port.isSessionAuthorized()) {
        title = request.getParameter("title");
        genre = request.getParameter("genre");
        actorFN = request.getParameter("actorFN");
        actorLN = request.getParameter("actorLN");
        videoType = request.getParameter("videoType");
        year = request.getParameter("year");
        yearToInt = Integer.parseInt(year);
        inbuiltActor = request.getParameter("inbuiltActor");
        
        id = BigDecimal.valueOf(Long.parseLong(request.getParameter("id")));
        
        if(inbuiltActor.equals("other")){
            starActor = new StarActor();
            if(actorFN != null){
               starActor.setFirstname(actorFN);
            }
            if(actorLN != null){
               starActor.setLastname(actorLN);
            }
        }
        else{
            BigDecimal bdActorId = new BigDecimal(inbuiltActor);
            starActor = port.getStarActor(bdActorId);    
        }
        
        //thumbnail = request.getParameter("upload");
        
        
        byte[] thumbnailBuffer = null;
            int bufferSize = 0;
            for (Part part : request.getParts()) {
                
                if( part.getSubmittedFileName() != null){
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();

                thumbnailBuffer = new byte[(int) part.getSize()];
                bufferSize = thumbnailBuffer.length;

                part.getInputStream().read(thumbnailBuffer, 0, bufferSize);
                bytes.write(thumbnailBuffer);
            }
            }

            try {
                //enable MTOM
                BindingProvider bindingProvider = (BindingProvider) port;
        SOAPBinding soapBinding = (SOAPBinding) bindingProvider.getBinding();
        soapBinding.setMTOMEnabled(true);
        
                port.putVideo(id,title, thumbnailBuffer, genre, videoType, yearToInt, starActor);
            } catch (Exception_Exception ex) {
                Logger.getLogger(AddVideo.class.getName()).log(Level.SEVERE, null, ex);
            }

            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
                out.println("<title>Post Success</title>");
                out.println("<link rel='stylesheet' href= 'https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
                out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class='container alert alert-success'>");

                out.println("<h1>Video Edited Successfully</h1>");
                out.println("<h1>Back to <a href='Manager'>Manager</a></h1>");

                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
