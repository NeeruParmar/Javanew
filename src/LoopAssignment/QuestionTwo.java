package LoopAssignment;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//There is a water tank of capacity 100 litres. Water is filled into it using bucket which have capacity of 10 litres.  Write a program which fills the tank to its capacity using these buckets. Also include a 		
		//mechanism in your program to stop the tank from over flowing.
		int bucketCap =10;
		int tank = 0;
		
		 
		
			for(int forCounter=1;forCounter<=10;forCounter++) {
			tank =tank + bucketCap;
			if (tank==100)
			{
				System.out.println("tank filled max capacity "+ tank );
			
			break;
			}
			}
			
	
		}
		
		
		

	}



