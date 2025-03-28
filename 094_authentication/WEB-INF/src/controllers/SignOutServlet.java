package controllers;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import javax.servlet.annotation.WebServlet;



@WebServlet("/signout.do")
public class SignOutServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException, ServletException
    {
        HttpSession session = request.getSession();

        session.invalidate();

        request.getRequestDispatcher("signin.jsp").forward(request, response);
    }
}