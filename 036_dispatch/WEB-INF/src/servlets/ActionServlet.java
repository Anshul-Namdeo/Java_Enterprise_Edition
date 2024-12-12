package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String username = request.getParameter("nm");
        String email = request.getParameter("em");
        String password = request.getParameter("pw");

        System.out.println("Action Servlet ----------POST-------------start");

        System.out.println(username + " " + email + " " + password);

        System.out.println("Action Servlet ---------POST---------------end");

        request.getRequestDispatcher("pro.do").forward(request, response);
    }
}