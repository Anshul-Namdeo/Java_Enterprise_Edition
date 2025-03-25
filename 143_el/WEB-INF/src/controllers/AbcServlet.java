package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import models.User;


@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User u1 = new User("om", 12);
        User u2 = new User("ram", 14);
        User u3 = new User("shyam", 16);

        Map<String, User> recs = new HashMap<>();
        recs.put("A1", u1);
        recs.put("A2", u2);
        recs.put("A3", u3);
        
        request.setAttribute("mno", recs);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}