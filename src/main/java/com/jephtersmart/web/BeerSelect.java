package com.jephtersmart.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.jephtersmart.model.BeerExpert;

public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("Beer Selection Advice<br>");
        String color = request.getParameter("color");
        BeerExpert expert = new BeerExpert();
        List advices = expert.getBrands(color);
        // writer.println("<br>Got beer color " + color);
        // String advice = "";
        // Iterator iterator = advices.iterator();
        // while ((advice = (String) iterator.next()) != null) {
        // writer.println(advice + "<br>");
        // }
        request.setAttribute("styles", advices);
        RequestDispatcher view = request.getRequestDispatcher("beer-advice.jsp");
        view.forward(request, response);

    }
}