package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.User;

import javax.servlet.http.HttpSession;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException{
        HttpSession session = request.getSession();// add after
        
        User user = new User();

        user.setName("Bindusar");
        user.setAge(1);

        // request.setAttribute("mno", user);
        session.setAttribute("mno", user);


        request.getRequestDispatcher("next.jsp").forward(request, response);

    }
}