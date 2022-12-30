package br.gov.rn.emater;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.gov.rn.emater.Classes.Amostra;
import br.gov.rn.emater.Controler.AmostraController;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cledsonfs
 */
public class getImagemServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            AmostraController amostraController = new AmostraController();
            byte[] bytearray = new byte[1024];
            int size = 0;
            InputStream sImage;
            sImage = amostraController.getImageStream(request.getParameter("idamostra"));
            response.reset();
            response.setContentType("image/jpeg");
            response.addHeader("Content-Disposition", "filename=" + request.getParameter("idamostra") + ".jpeg");
            while ((size = sImage.read(bytearray)) != -1) {
                response.getOutputStream().write(bytearray, 0, size);
            }
            response.flushBuffer();
            sImage.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
