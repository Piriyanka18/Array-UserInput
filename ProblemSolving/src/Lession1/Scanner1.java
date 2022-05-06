package Lession1;

import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("What is your Name?");
	  String name = scan.next();
	  
	 
	  System.out.println("Your Name is  "+name+".");
	  
	  System.out.println("What is your age?");
	  int age = scan.nextInt();
	  
	  System.out.println("Your Age is  "+age+".");
	  
	  System.out.println("What is your Seniour Quote?");
	  String Quote = scan.next();
	  Quote += scan.nextLine();
	  
	  System.out.println("Your Quote is  "+Quote+".");
	  

	}

}
