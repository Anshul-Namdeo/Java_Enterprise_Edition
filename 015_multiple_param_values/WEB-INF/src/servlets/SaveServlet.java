package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class SaveServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        String gender = requset.getParameter("gender");
        String[] foods = requset.getParameterValues("food");
        String[] cities = requset.getParameterValues("city");

        pw.write("<h1>Gender : " + gender + "</h1>");

        for(String food : foods)
        pw.write("<h1>Food : " + food + "</h1>");

        for(String city : cities)
        pw.write("<h1>City : " + city + "</h1>");

        pw.flush();
        pw.close();
    }
}

