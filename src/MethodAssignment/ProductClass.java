package MethodAssignment;

public class ProductClass {
//Question 3 There is Product class which has 3 variables that are already initialized, productName ,
//product description  and price. Write methods which just prints these values and call it from main class. 
	
	
	String productName= "Microwave";
	String productDesc ="helps to warm food";
	double productPrice= 250;
	
	
	void printProductName() {
		System.out.println("Name of the Product is " +productName);
	}
	
	void printProductDesc() {
		System.out.println("Description  of the Product is "+productDesc );
	}

			
	void printProductPrice() {
		System.out.println("Price of the Product is " +productPrice);
	}
	
	
	

}
