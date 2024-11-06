package com.xworkz.signUp.service;

import com.xworkz.signUp.dto.SignUpDTO;

public interface SignUpService {

	boolean validateAndSave(SignUpDTO signUpDTO);
}
