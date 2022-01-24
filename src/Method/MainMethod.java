package Method;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int numx= 0;
		 int numy= 0;
		
		 System.out.println("Enter First Number");
		 
		 numx= scan.nextInt();
		 
		 System.out.println("Enter Second Number");
		 numy= scan.nextInt();
				
				
		MultiplicationClass multiplicationclass = new MultiplicationClass();
		multiplicationclass.multiplicationOfTwoNumbers(numx,numy);
		
		Subtraction subtraction = new Subtraction();
		subtraction.substractionOfTwoNum(numx,numy);
		
		

	}
	
	
	

}
