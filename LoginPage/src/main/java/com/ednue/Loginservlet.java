package com.ednue;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginservlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String username=req.getParameter("name");
		String password=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		
		if (username.equals("admin") && password.equals("1234")) {
			 out.println("<h2>Login Successful!</h2>");
			 out.println("<p>Welcome, " + username + "!</p>");
			 out.println("<a href='profile?user=" + username + "'>Go to Profile</a>");
			 } else {
			 out.println("<h2>Login Failed!</h2>");
			 out.println("<p>Invalid username or password.</p>");
			 out.println("<a href='index.html'>Try Again</a>");
			 }

		
	}

}
