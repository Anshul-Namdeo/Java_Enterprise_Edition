package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpSession;

@WebServlet("/info.do")
public class InfoServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException
    {
        HttpSession session = request.getSession();

        System.out.println("Info Servlet-------EX63-----");
        
        ServletContext context = getServletContext();
    //    Integer count = (Integer)session.getAttribute("count");
       Integer count = (Integer)context.getAttribute("count");
       System.out.println("Info servlet-------Ex63---" + count);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}