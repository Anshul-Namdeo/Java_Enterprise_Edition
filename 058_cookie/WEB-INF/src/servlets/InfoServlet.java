package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

@WebServlet("/info.do")
public class InfoServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        HttpSession session = request.getSession();

        System.out.println(session.getId());

        // String cookies = request.getHeader("cookie");

        Cookie[] cookies = request.getCookies();

        for(Cookie cookie: cookies)
        {
            System.out.println(cookie.getName() + " -> " + cookie.getValue());
        }

        request.getRequestDispatcher("index.html").forward(request, response);

    }
}