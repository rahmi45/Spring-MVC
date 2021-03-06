package fr.formation.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeValidator implements ConstraintValidator<VertyCode, String>{

	private String myCode;
	
	@Override
	public void initialize(VertyCode code) {
		myCode = code.value();
		//System.out.println(myCode);
	}
	
	@Override
	public boolean isValid(String code, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		boolean res;
	
		if (code != null) {
			res= code.startsWith(myCode);
		} else {
			
			res = true;
		}
		
		return res;
	}
	
	
}
