package HelloServlets;

import com.google.gson.Gson;

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

@WebServlet(name = "Servlet", urlPatterns = {"/hello", "/kjhfkjhgf", "/Servlet","/update"})
//@WebServlet("/update")
public class Servlet extends HttpServlet {

    public Servlet(){
        super();
    }
    public void doGet(HttpServletRequest req,  HttpServletResponse res) throws ServletException, IOException {
    //    req.setAttribute("username",req.getParameter("username"));
      //  if(req.getParameter("username").equals("amir"));
        //{
           req.getRequestDispatcher("HomePage/homePage.jsp").forward(req, res);
        //}
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        doGet(req, res);
        System.out.println(req);
        Map<String,Object> map=new HashMap<String,Object>();
        boolean isValid = false;
        String username= req.getParameter("username");
        System.out.println(username);
        if(username.equals("ofir")){
            isValid = true;
            map.put("username",username);
        }
        map.put("isValid",isValid);
        write(res,map);
    }

    private void write(HttpServletResponse res, Map<String, Object> map) throws IOException {
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        res.getWriter().write(new Gson().toJson(map));
    }

}
