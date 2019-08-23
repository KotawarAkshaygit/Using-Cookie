package com.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieLet
 */
public class CookieLet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			int a=Integer.parseInt(request.getParameter("a"));
			int b=Integer.parseInt(request.getParameter("b"));
			
			int c=a+b;
			Cookie cookie=new Cookie("c",c+"");
			
			response.addCookie(cookie);
			
			response.sendRedirect("result.jsp");
	}

}
