package com.hcl.calc;

public class CalculateThings {		
	
	public static void main(String[] args) {
		
		CalculateMethods calc = new CalculateMethods();
		
		calc.printMethod("Hello there, world!");
		calc.printMethod(String.valueOf(calc.fivePlusFive()));
		calc.printMethod(String.valueOf(calc.sum(5, 3)));	
	}
	

	

}
