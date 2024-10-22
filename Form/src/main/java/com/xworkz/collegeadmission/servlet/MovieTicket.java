package com.xworkz.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.collegeadmission.dto.MovieTicketDto;

@WebServlet("/movie")
public class MovieTicket extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("Name");
		String totalTickets = request.getParameter("TotalTickets");
		String theaterName = request.getParameter("TheaterName");
		String seatType = request.getParameter("SeatType");
		String donation = request.getParameter("Donation");
		String date = request.getParameter("Date");
		String time = request.getParameter("time");
		
		MovieTicketDto movieTicketDto = new MovieTicketDto();

		PrintWriter pw = response.getWriter();

		pw.print("Success in sending Dataaa....");

	}

}
