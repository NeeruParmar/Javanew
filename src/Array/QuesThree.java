package Array;

import java.util.Scanner;

public class QuesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ques 3:

		Scanner scan = new Scanner(System.in);
 
		String[] samsungBrand = new String [4];

		System.out.println("List of  Samsung Phone models ");

		for (int i = 0; i < samsungBrand.length; i++) {
			System.out.println("Enter Phone models Name ");
			samsungBrand [i] =scan.next();
			}
		for (int i = 0; i < samsungBrand.length; i++) {
			System.out.println(samsungBrand [i] );
		}
		String[] appleBrand = new String [4];

		System.out.println("List of  Apple Phone models ");

		for (int i = 0; i < appleBrand.length; i++) {
			System.out.println("Enter Phone models Name ");
			appleBrand [i] =scan.next();
			}
		for (int i = 0; i < appleBrand.length; i++) {
			System.out.println(appleBrand [i] );
		}
		String[] googleBrand = new String [4];

		System.out.println("List of  Google  Phone models ");

		for (int i = 0; i < googleBrand.length; i++) {
			System.out.println("Enter Phone models Name ");
			googleBrand [i] =scan.next();
		}
			for (int i = 0; i < googleBrand.length; i++) {
				System.out.println(googleBrand [i] );
			}	
			
			
		
		}
	
}
