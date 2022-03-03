package hashmapAssignment;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> phoneMap = new HashMap<String, String>();
		
		
		phoneMap.put("Mamatha", "123456");
		phoneMap.put("Swaroop", "123457");
		phoneMap.put("Kamal", "123458");
		phoneMap.put("Simar", "123459");
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Name to search phone number");
		String name =sc.next();
		
		if (phoneMap.containsKey(name) ) {
			System.out.println("Phone number is  " +phoneMap.get(name) );
		} else 
			System.out.println("Not found");

		}
		

		
		
		

	}


