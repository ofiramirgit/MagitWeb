package HelloServlets;

import Logic.Logic;
import com.google.gson.Gson;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


@WebServlet(name = "Servlet")
//@WebServlet("/update")
public class Servlet extends HttpServlet {

    Logic logic = new Logic();
    public Servlet(){
        super();
    }
    public void doGet(HttpServletRequest req,  HttpServletResponse res) throws ServletException, IOException {
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Map<String,Object> map=new HashMap<String,Object>();
        String username= req.getParameter("username");
        System.out.println(username);
        Boolean isValid = logic.userExist(username);
        map.put("isValid", isValid);
        write(res, map);
//        if(!isValid) {
//            map.put("isValid", isValid);
//            write(res, map);
//        }
//        else{
////            req.getRequestDispatcher("/HomePage/homePage.jsp").forward(req, res);
////            req.getRequestDispatcher("/homePage.jsp").forward(req,res);
//            req.setAttribute("user",username);
//            RequestDispatcher rd =  req.getRequestDispatcher("homePage.jsp");
//            rd.forward(req, res);
//            rd.include(req, res);
//        }
    }

    private void write(HttpServletResponse res, Map<String, Object> map) throws IOException {
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        res.getWriter().write(new Gson().toJson(map));
    }

}
