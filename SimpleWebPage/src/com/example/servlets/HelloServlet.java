package com.example.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Hello, Welcome to My Simple Java Web Page!</h1>");
        out.println("<p>This page is generated using a Java Servlet.</p>");
        out.println("<a href='index.jsp'>Go Back to Home</a>");
        out.println("</body></html>");
    }
}
