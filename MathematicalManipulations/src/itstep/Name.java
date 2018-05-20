package itstep;

import java.util.Scanner;

public class Name {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Input first name!");
		String n1 = scn.nextLine();
		
		String n2 = " ";
		
		System.out.println("Input second name!");
		String n3 = scn.nextLine();
		
		String n4 = n1 + n2 + n3;
		
		System.out.println("Your full name is " + n4);
		
	
	}
	
	
}
	
	
	
	
	
	


	

