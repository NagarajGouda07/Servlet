package com.xworkz.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		String mobileNo = request.getParameter("MobileNo");
		String age = request.getParameter("Age");
		String address = request.getParameter("Address");
		
		PrintWriter pw = response.getWriter();
		//pw.print("Name = " + name);
		//pw.print("Email = " + email);
		//pw.print("MobilNo = " + mobileNo);
		//pw.print("Age = " + age);
		//pw.print("Address = " + address);
		
		pw.print("Contact is Success............");
		
	}

}
