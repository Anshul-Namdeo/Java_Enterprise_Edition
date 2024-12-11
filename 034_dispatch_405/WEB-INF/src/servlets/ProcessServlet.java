package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

@WebServlet("/pro.do")
public class ProcessServlet extends HttpServlet 
{
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException 
    {
        System.out.println("Process Servlet-----------GET--------------");

        request.getRequestDispatcher("next.html").forward(request,response);
    }
}