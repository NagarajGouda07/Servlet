package com.xworkz.signUp.service;

import com.xworkz.signUp.dto.SignUpDTO;

public class SignUpServiceImpl implements SignUpService{

	@Override
	public boolean validateAndSave(SignUpDTO signUpDTO) {

		boolean valid=true;
		if(signUpDTO!=null) 
		{
			String userName=signUpDTO.getUserName();
			if(userName!=null && !userName.isEmpty())
			{
				System.out.println("Valid UserName");
			}
			else
			{
				System.out.println("In-Valid UserName");
				valid=false;
			}
			
			String email=signUpDTO.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith(".in"))) 
			{
				System.out.println("Given email is valid....");
			} else 
			{
				System.err.println("Given email is Invalid....");
				valid=false;
			}
			
			String password=signUpDTO.getPassword();
			if(password!=null && !password.isEmpty())
			{
				System.out.println("Valid password");
			}
			else
			{
				System.out.println("In-Valid password");
				valid=false;
			}
			
			String confirmPassword=signUpDTO.getConfirmPassword();
			if(confirmPassword!=null && !confirmPassword.isEmpty() && password.equals(confirmPassword))
			{
				System.out.println("Valid Confirm Password");
			}
			else
			{
				System.out.println("In-Valid Confirm Password");
				valid=false;
			}
			
		}
		
		return valid;
	}

}
