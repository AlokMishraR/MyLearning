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

/**
 *
 * @author ALOK
 */
@WebServlet(name = "PNR", urlPatterns = {"/PNR"})
public class PNR extends HttpServlet {

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
           String st=request.getParameter("textfield");
            Connection con=(Connection)getServletContext().getAttribute("connection");
           PreparedStatement pst=con.prepareStatement("select * from reservationpnr where pnr=?");
           pst.setString(1, st);
           ResultSet rs=pst.executeQuery();
           if(rs.next())
           {
              session.setAttribute("id11",rs.getString(1));
              session.setAttribute("id12",rs.getString(2));
              session.setAttribute("id13",rs.getString(3));
              session.setAttribute("id14",rs.getString(4));
              session.setAttribute("id15",rs.getString(5));
              session.setAttribute("id16",rs.getString(6));
              session.setAttribute("id17",rs.getString(7));
              session.setAttribute("id18",rs.getString(8));
              response.sendRedirect("pnrinfo.jsp");
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
