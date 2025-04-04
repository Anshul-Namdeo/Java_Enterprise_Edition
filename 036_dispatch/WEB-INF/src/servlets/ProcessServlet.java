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
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        System.out.println("Process Servlet ---------Post----------" + request.getMethod());
        doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String username = request.getParameter("nm");
        String email = request.getParameter("em");
        String password = request.getParameter("pw");

        System.out.println("Process Servlet ----------GET-------------start");

        System.out.println(username + " " + email + " " + password);

        System.out.println("Process Servlet ---------GET---------------end");

        request.getRequestDispatcher("next.html").forward(request, response);
    }
}