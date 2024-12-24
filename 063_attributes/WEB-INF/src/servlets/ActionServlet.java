package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpSession;


@WebServlet("/act.do")
public class ActionServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException
    {
        HttpSession session = request.getSession();

        System.out.println("Action Servlet-------EX63-----");
        

        session.setAttribute("count", 34);

        request.getRequestDispatcher("next.html").forward(request, response);
    }
}