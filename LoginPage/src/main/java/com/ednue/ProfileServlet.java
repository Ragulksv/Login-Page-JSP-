package com.ednue;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
 
        String username = req.getParameter("user");
        
        out.println("<html><head><title>Profile Page</title></head><body>");
        out.println("<h2>Welcome, " + username + "!</h2>");
        out.println("<p>This is your profile page.</p>");
        out.println("<form action='index.html'>");
        out.println("<input type='submit' value='Logout'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}