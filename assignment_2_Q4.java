package acadview;

import java.util.Scanner;

public class assignment_2_Q4 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a - " );
		int a = sc.nextInt();
		
		System.out.print("Enter b - ");
		int b = sc.nextInt();
		
		System.out.print("Enter c - ");
		int c = sc.nextInt();
		
		if(a>=b&&a>=c){
			System.out.println("a is greater");
			}
			
			 if (b>=a&&b>=c){
				
				System.out.println("b is greater");
				
			}
			if (c>=a&&c>=b)
			 {System.out.println("c is greater");}
		}
		
	}


