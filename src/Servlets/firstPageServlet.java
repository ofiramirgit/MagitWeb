package Servlets;

import Logic.Logic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "firstPageServlet", urlPatterns = {"/loginPage"})
public class firstPageServlet extends HttpServlet {
    Logic logic = new Logic();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        ArrayList<String> notificationList=logic.getNotifications();
        request.setAttribute("user", username);
        RequestDispatcher rd =  request.getRequestDispatcher("homePage.jsp");
        rd.forward(request,response);
    }
}
