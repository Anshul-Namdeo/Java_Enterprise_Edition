package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

@WebServlet("/pro.do")
public class ProcessServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest requset, HttpServletResponse response) throws IOException, ServletException
    {
        System.out.println("Process Servlet---------Post-------------" + requset.getMethod());
        doGet(requset, response);
    }

      public void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException, ServletException
    {
        System.out.println("Process Servlet---------Get-------------" + requset.getMethod());

        requset.getRequestDispatcher("next.html").forward(requset, response);
    }
}