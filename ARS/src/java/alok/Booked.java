/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alok;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 *
 * @author ALOK
 */
@WebServlet(name = "Booked", urlPatterns = {"/Booked"})
public class Booked extends HttpServlet {

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
             Random r=new Random();
             Integer i=r.nextInt(1000000);
             String st=i.toString();
             String s1=(String)session.getAttribute("id2");
             Connection con=(Connection)getServletContext().getAttribute("connection");
           PreparedStatement pst=con.prepareStatement("select * from flightinfo where flightno=?");
             pst.setString(1, s1);
             ResultSet rs=pst.executeQuery();
               PreparedStatement pst1=con.prepareStatement("insert into reservationpnr values(?,?,?,?,?,?,?,?)");
               pst1.setString(1, st);
               
               session.setAttribute("id3", st);
               while(rs.next())
               {
               pst1.setString(2, rs.getString(1));
               pst1.setString(3, rs.getString(2));
               pst1.setString(4, rs.getString(3));
               pst1.setString(5, rs.getString(4));
               pst1.setString(6, rs.getString(5));
               pst1.setString(7, rs.getString(6));
               pst1.setString(8, rs.getString(7));
            
               session.setAttribute("id4", rs.getString(1));
               session.setAttribute("id5", rs.getString(2));
               session.setAttribute("id6", rs.getString(3));
               session.setAttribute("id7", rs.getString(4));
               session.setAttribute("id8", rs.getString(5));
               session.setAttribute("id9", rs.getString(6));
               session.setAttribute("id10", rs.getString(7));
               }
               int i1=pst1.executeUpdate();
               if(i1>0)
               {
                   response.sendRedirect("ticketinfo.jsp");
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
