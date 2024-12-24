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
        System.out.println("Info Servlet-----------");

       String name = (String)request.getAttribute("nm");

        System.out.println("Info Servlet-----------" + name);

        request.getRequestDispatcher("next.html").forward(request,response);
    }
}
