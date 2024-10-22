package com.xworkz.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.collegeadmission.dto.FeedBackDto;

@WebServlet("/feed")
public class FeedBack extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		String comments = request.getParameter("Comments");

		FeedBackDto feedBackDto = new FeedBackDto();

		PrintWriter pw = response.getWriter();

		pw.print("Success in sending Dataaaaaaa....");
	}

}
