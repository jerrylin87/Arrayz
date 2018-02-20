package day06;

import java.util.Scanner;

public class Arrayz {

public static void main(String[] args) {
	int n3, n2, n1;
	int i, limit;
	Scanner sc = new Scanner(System.in);
	boolean check = true;
	while(check ==true) {
	System.out.println("Input your First value less than 10");
	n1 = sc.nextInt();	// Input your First value
	if (n1 < 10) {
		System.out.println("Input your Second value less than 10");
	}
	
	else {
		System.out.println("Please enter a value less than 10");
		check = false;
		break;
	}
	
	n2 = sc.nextInt(); // Input your Second value
	
	if (n2 < 10) {
		System.out.println("Input the Length of Array");
	} 
	
	else {
		System.out.println("Please enter a value less than 10");
		check = false;
		break;
	} // end else
	
	int count = sc.nextInt(); // Input the Length of Array
	
	if (count <= 12 && count > 0) {
	System.out.println("Input Limit for Array");  
	} else {
		System.out.println("Invalid input");
		break;
	}
	limit =sc.nextInt(); // Input Limit for Array
	System.out.println("Your Array is: ");
	if (count < 2) {
		System.out.print(n1); //printing n1 only
	} else {
		System.out.print(n1+" "+n2); //printing 0 and 1  
	}    
	for(i=2;i<count;++i) //loop starts from 2 because 0 and 1 are already printed    
		{    
			n3=n1+n2;    
		System.out.print(" "+n3);
	
			if (n3 < limit) {
			n1=n2;   
			n2=n3; 
			} else {
			break;
			}
			
		} // end of for
	break;
	
		} // end of while
	} // end of main	
} // end of class