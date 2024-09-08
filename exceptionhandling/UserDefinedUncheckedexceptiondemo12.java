package com.evergent.corejava.exceptionhandling;
class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message)
	{
		super(message);
	}}
public class UserDefinedUncheckedexceptiondemo12 {
	public void validateScore(int score) 
	{
		if(score<0||score>100)
		{
			throw new InvalidScoreException("score must be between 0 and 100..");
		}
		else {
			System.out.println("valid score...");
		}
	}
	public static void main(String[] args) {
		try {
		UserDefinedUncheckedexceptiondemo12  udu=new UserDefinedUncheckedexceptiondemo12 ();
		udu.validateScore(110);
		}
		catch(InvalidScoreException e)
		{
			System.out.println("caught exception: "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("program continues after handling...");
	}

}
