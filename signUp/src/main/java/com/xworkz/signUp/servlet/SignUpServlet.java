package com.xworkz.signUp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.signUp.dto.SignUpDTO;
import com.xworkz.signUp.service.SignUpService;
import com.xworkz.signUp.service.SignUpServiceImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/SignUp")
public class SignUpServlet extends HttpServlet{
	
	public SignUpServlet() {
		System.out.println("no arg const of SignUpServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("service of SignUpServlet");
		String userName = req.getParameter("userName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");

		SignUpService signUpService = new SignUpServiceImpl();
		SignUpDTO signUpDTO=new SignUpDTO(userName, email, password, confirmPassword);
		boolean valid = signUpService.validateAndSave(signUpDTO);
		if (valid) {
			System.out.println("SignUp is valid");
			req.setAttribute("success", "hi SignUp is success");

		} else {
			System.out.println("SignUp is In-valid");
			req.setAttribute("failure", "hi SignUp is failure");
			req.setAttribute("dto", signUpDTO);

		}
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/SignUp.jsp");
		requestDispatcher.forward(req, resp);

	}

}
