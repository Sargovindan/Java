package com.itcuties.java;

public class RecursionSample {

	public static void main(String[] args) {
		
		double divideThis 	= 1000;
		double divideby   	= 2;
		long howManyTimes	= 10;
		
		System.out.println("The result of dividing " + divideThis + " by " + divideby + " " + howManyTimes + " is " 
							+ divide(divideThis, divideby, howManyTimes));
	}
	
	public static double divide(double what, double divideBy, long times) {
		double result = what/divideBy;
		
		if (times-- > 0)
			return divide(result, divideBy, times);
		
		return result;
	}
	
}
