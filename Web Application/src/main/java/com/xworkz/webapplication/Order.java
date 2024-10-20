package com.xworkz.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Order")
public class Order implements Servlet {
	ServletConfig config;

	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) {
		this.config = config;
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("Customer Name");
		String item = request.getParameter("Item");
		String quality = request.getParameter("Quality");
		
		PrintWriter pw = response.getWriter();
		//pw.print("Customer Name =" + name);
		//pw.print("Item =" + item);
		//pw.print("Quality =" + quality);
		
		pw.println("order is Confirm in item......");
		
	}

}
