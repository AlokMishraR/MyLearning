/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alok;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ALOK
 */
@WebServlet(name = "Reservation", urlPatterns = {"/Reservation"})
public class Reservation extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session=request.getSession();
             String s1=request.getParameter("textfield2");
          String s2=request.getParameter("textfield");
          String s3=request.getParameter("textfield3");
           String s4=request.getParameter("RadioGroup1");
          String s5=request.getParameter("textfield4");
          String s6=request.getParameter("textfield5");
           String s7=request.getParameter("textfield6");
          String s8=request.getParameter("RadioGroup2");
          String s9=request.getParameter("textfield7"); 
           Connection con=(Connection)getServletContext().getAttribute("connection");
           PreparedStatement pst=con.prepareStatement("insert into reservation values(?,?,?,?,?,?,?,?,?)");
           pst.setString(1, s1);
           pst.setString(2, s2);
           pst.setString(3, s3);
           pst.setString(4, s4);
           pst.setString(5, s5);
           pst.setString(6, s6);
           pst.setString(7, s7);
           pst.setString(8, s8);
           pst.setString(9, s9);
           int i=pst.executeUpdate();
           if(i>0)
           {
               session.setAttribute("id2",s9 );
               response.sendRedirect("booked.jsp");
           }
           
        }catch(Exception e)
        {
            out.println(e);
        }
        
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
