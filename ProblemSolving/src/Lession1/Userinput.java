package Lession1;

import java.io.IOException;

public class Userinput {

	public static void main(String[] args) 
	throws IOException{
		char input;
		
		System.out.println("Enter the number ");
		
		input=(char)System.in.read();
		
		if(input>0) System.out.println("Postive");
			
		if(input<0) System.out.println("Negative");
			
		
		

	}

}
