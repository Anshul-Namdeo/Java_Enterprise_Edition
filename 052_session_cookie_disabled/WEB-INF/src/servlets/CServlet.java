package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpSession;

@WebServlet("/c.do")
public class CServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException, ServletException
    {
        HttpSession session = request.getSession();

        String sessionId = session.getId();

        boolean sessionNayaHaiKya = session.isNew();

        int maxInactiveInterval = session.getMaxInactiveInterval();

        System.out.println("CServlet----------SessionId: " + sessionId + " IsNew:" + sessionNayaHaiKya + "  MaxInactiveInterval:" + maxInactiveInterval );

        request.getRequestDispatcher("next.html").forward(request, response);


    }
}