package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpSession;

import java.util.Date;

@WebServlet("/b.do")
public class BServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException, ServletException
    {
        HttpSession session = request.getSession();

        String sessionId = session.getId();

        boolean sessionNayaHaiKya = session.isNew();

        int maxInactiveInterval = session.getMaxInactiveInterval();

        Date sessionCreationTime = new Date(session.getCreationTime());

        Date sessionLastAccessedTime = new Date(session.getLastAccessedTime());

        System.out.println("BServlet----------SessionId: " + sessionId + " IsNew: " + sessionNayaHaiKya + "  MaxInactiveInterval: " + maxInactiveInterval + "  SessionCreationTime: " + sessionCreationTime + "  SessionLastAccessedTime: " + sessionLastAccessedTime );

        session.setMaxInactiveInterval(30);

        request.getRequestDispatcher("info.html").forward(request, response);


    }
}