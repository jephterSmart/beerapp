package com.jephtersmart.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("Beer Selection Advice<br>");
        String color = request.getParameter("color");
        writer.println("<br>Got beer color " + color);
    }
}