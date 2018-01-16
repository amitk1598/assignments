package acadview;

import java.util.Scanner;

public class assignment_2_Q7 {
 public static void main(String[] args){
	 
	 Scanner sc= new Scanner(System.in);
	 boolean prime = false;
	 System.out.println("Enter number - ");
	 int a = sc.nextInt();

	 
	 for (int i = 2;i<a;i++){
		 
			 if(a%i==0){ prime = true;}
			 
	 }
		if(prime == false){
			
	 System.out.println("prime");}
		
	 else{
System.out.println("not prime ");
} 
	 
 }
}
