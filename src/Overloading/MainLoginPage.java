package Overloading;

public class MainLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credentials obj=new Credentials();
		
		obj.craAccType(1111, 1103);
		obj.craAccType(9000, "Smith@123");
		obj.craAccType("smith@gmail.com", "Smith@123");
		

	}

}
