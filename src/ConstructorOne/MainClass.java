package ConstructorOne;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartyDress obj1 = new PartyDress ();
		PartyDress obj2 =new PartyDress("Medium","Black");
		
		System.out.println("First Dress "+obj1.color  +obj1.size);
		System.out.println("Second Dress"+obj2.color+obj2.size);
		
		
		
		
	}

}
