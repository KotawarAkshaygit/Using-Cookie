package com.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class CookieLet
 */
public class CookieLet extends HttpServlet {
	
	static Logger logger=LogManager.getLogger(CookieLet.class);
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			int a=Integer.parseInt(request.getParameter("a"));
			int b=Integer.parseInt(request.getParameter("b"));
			
			int c=a+b;
			logger.info("in CookieLet and about to redirect to result jsp");
			Cookie cookie=new Cookie("c",c+"");
			
			response.addCookie(cookie);
			logger.info("successfully added");
			System.out.println("I m inside the Cookie Servlet handler");
			for (int i = 0; i < 5; i++) {
				System.out.println("I m in for loop");
				
			}
			response.sendRedirect("result.jsp");
	}

}
