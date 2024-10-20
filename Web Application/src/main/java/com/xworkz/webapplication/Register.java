package com.xworkz.webapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String fname = request.getParameter("FName");
		String lname = request.getParameter("LEmail");
		String email = request.getParameter("Email");
		String mobileNo = request.getParameter("MobileNo");
		String passWord = request.getParameter("PassWord");
		String confirmpassWord = request.getParameter("ConfirmPassWord");
		String gender = request.getParameter("Gender");
		String country = request.getParameter("Country");
		String stste = request.getParameter("State");
		String city = request.getParameter("City");
		
		
		PrintWriter pw = response.getWriter();
		
		
		pw.println("Your Register is Successfully....");
	
	}
 
 

}
