/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author ALOK
 */
@WebListener()
public class NewServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
         try
        {
         Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
            sce.getServletContext().setAttribute("connection", con);
    
    }catch(Exception e)
    {
         System.out.println(e);
    }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try
        {
        
        Connection con=(Connection)sce.getServletContext().getAttribute("connection");
        con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
