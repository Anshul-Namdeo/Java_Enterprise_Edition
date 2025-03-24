package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
        Map<String, Integer> records  = new HashMap<>();

        records.put("aaa",567);
        records.put("bbb",456);
        records.put("ccc",345);

        request.setAttribute("mno", records);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}