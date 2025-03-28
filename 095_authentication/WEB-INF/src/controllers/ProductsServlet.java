package controllers;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import javax.servlet.annotation.WebServlet;

import models.Product;
import models.User;
import java.util.ArrayList;

@WebServlet("/products.do")
public class ProductsServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException
    {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        // collect all products.....
        ArrayList<Product> products = Product.collectAllProducts(user.getUserId());

        request.setAttribute("Products", products);

        request.getRequestDispatcher("products.jsp").forward(request, response);
    }
}