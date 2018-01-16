package acadview;
import java.util.Scanner;

public class assignment_2_Q2 {
	
	
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
	System.out.println("Enter year - ");
    int a = sc.nextInt();
    
    if(a%4==0&&a%400==0){
    	System.out.println("Leap year");
    
    } else{System.out.println("Not a Leap year");}
		
		
	}

}
