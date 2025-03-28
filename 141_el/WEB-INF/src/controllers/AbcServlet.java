package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.User;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
        User user = new User();

        user.setName("Parshuram Prasad");
        user.setAge(15);

        request.setAttribute("mno", user);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}