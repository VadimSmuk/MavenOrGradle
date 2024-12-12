package org.example;


import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet<HttpServletResponse, HttpServletRequest> extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body><h1>Hello, World!</h1></body></html>");
    }
}
