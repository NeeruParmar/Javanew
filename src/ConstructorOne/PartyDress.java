package ConstructorOne;

public class PartyDress {
	String size ="small";
	String color= "red";
	
	PartyDress (){
		System.out.println("List of Dresses with Size and color" );
		
	}
	
	 PartyDress(String size, String color) {
	
		this.size = size;
		this.color = color;
	}
	
	

}
