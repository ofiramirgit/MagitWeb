package HelloServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = {"/hello", "/kjhfkjhgf", "/Servlet"})
public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req,  HttpServletResponse res) throws ServletException, IOException {
    //    req.setAttribute("username",req.getParameter("username"));
      //  if(req.getParameter("username").equals("amir"));
        //{
           req.getRequestDispatcher("HomePage/homePage.jsp").forward(req, res);
        //}
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }

}
