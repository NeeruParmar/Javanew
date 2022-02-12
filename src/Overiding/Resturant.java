package Overiding;

public class Resturant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please select below menu");
		
		Vegetarion veg = new Vegetarion(); 
		veg.ricePlain();
		veg.vegPaneerRice();
		
	System.out.println("Special Combo you can choose ");	
		NonVegetarion nonveg=new NonVegetarion();
		nonveg.butterChicken();
		nonveg.ricePlain();//overridden 

	}

}
