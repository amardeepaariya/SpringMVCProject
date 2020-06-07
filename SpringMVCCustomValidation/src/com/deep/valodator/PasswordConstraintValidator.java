package com.deep.valodator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class PasswordConstraintValidator implements ConstraintValidator<IsValidPassword, String> {
	
	private static String PASSWORD_PATTERN ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	private Pattern pattern;
	private Matcher matcher;

	public PasswordConstraintValidator() {
		// TODO Auto-generated constructor stub
		pattern =Pattern.compile(PASSWORD_PATTERN);
	}
	
	@Override
	public void initialize(IsValidPassword isValidPassword) {
		// TODO Auto-generated method stub
			isValidPassword.message();
		
	}

	@Override
	public boolean isValid(String password, ConstraintValidatorContext cxt) {
		// TODO Auto-generated method stub
		if(password == null) {
			return false;
		}
		matcher =pattern.matcher(password);
		return matcher.matches();
	}
	

}
