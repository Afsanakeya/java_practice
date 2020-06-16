package iqbalvai;

import java.util.Scanner;

public class scannermethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Your name");
		String Name= scan.nextLine();
		
		System.out.println("Enter your gender(male/female)");
		String gender=scan.nextLine();
		
		
		System.out.println("Enter your password");
	    
		String password=scan.nextLine();
		
		if(Name.equalsIgnoreCase("afsana keya")&& password.equals("amayra"))
	    {System.out.println("You are a valid user");
	
	}
		
		
	else {
		System.out.println("You are a invalid user");
	}
	    	
	    }}
	



