package com.xworkz.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.collegeadmission.dto.ConcertTicketDto;

@WebServlet("/concert")
public class ConcertTicket extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String location = request.getParameter("Location");
		String artistName = request.getParameter("artistName");
		String ticketType = request.getParameter("ticketType");
		String noOfTickets = request.getParameter("noOfTickets");
		String preferenceType = request.getParameter("preferenceType");
		
		ConcertTicketDto ctd = new ConcertTicketDto();
		
		PrintWriter pw = response.getWriter();

		pw.print("Success in sending Dataaaa....");

	}

}
