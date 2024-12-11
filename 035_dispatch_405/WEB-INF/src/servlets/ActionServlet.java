package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest requset, HttpServletResponse response) throws IOException, ServletException
    {
        System.out.println("Action Servlet---------Post-------------" + requset.getMethod());

        requset.getRequestDispatcher("pro.do").forward(requset, response);
    }
}