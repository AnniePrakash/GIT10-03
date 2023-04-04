package org.constructSample;

import java.util.Scanner;

//Java==>avaJ

public class proj {
	
	private void amstrongNumber() {
		System.out.println("Enter Your number");
		
		Scanner scanner=new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		int a=0;
		int b=number;
		int result=0;
		
		
		while(number>0) {
			
			a=number%10;
			
			number=number/10;
			
			result=result+(a*a*a);
		}
		
		if (result==b) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not an Amstrong number");
		}
		}
		
		
	
	
	public static void main(String[] args) {
		proj e=new proj();
		
		e.amstrongNumber();
	}
	
	

	}

	
	
		
		

						
	
	
				
			

		
	
	

