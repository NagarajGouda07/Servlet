package com.xworkz.internal.runner;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/run")
public class Rajajinagar extends HttpServlet{
	
	public Rajajinagar() {
		System.out.println("Nagaraj is a Running");
	}
	
	@Override
	protected void service(HttpServletRequest raqs, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Anything----------");
		/*The service() method is part of the servlet lifecycle and is responsible for handling requests.*/
		//resp.getWriter().write("Today is good day");
	
	}
}
