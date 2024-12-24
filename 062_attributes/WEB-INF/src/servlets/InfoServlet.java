package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

@WebServlet("/info.do")
public class InfoServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
    {
         System.out.println("Info Servlet--------Ex62------");

        Integer count = (Integer)request.getAttribute("count");
        System.out.println("Info servlet ---------Ex62---------" + count);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}