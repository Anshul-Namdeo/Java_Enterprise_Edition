package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        HttpSession session = request.getSession();

        System.out.println(session.getId());

        Cookie c1 = new Cookie("name", "raji");
        Cookie c2 = new Cookie("age", "12");
        Cookie c3 = new Cookie("school", "Ayodhya");
        Cookie c4 = new Cookie("standard", "10th");

        c1.setMaxAge(30);
        response.addCookie(c1);
        c2.setMaxAge(-22);
        response.addCookie(c2);
        c3.setMaxAge(0);
        response.addCookie(c3);
        response.addCookie(c4);

        request.getRequestDispatcher("next.html").forward(request, response);
    }
}