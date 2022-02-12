package Overloading;

public class Credentials {
	
	public void  craAccType(int phoneNum, int authCode) {
		System.out.println("Thank you for Login with phone number and with Phone number and secure Authode");
	}
	
	public void  craAccType(String email, String  password) {
		System.out.println("Thank you for Login with Email and Secure Password ");
	}
	
	public void  craAccType(int sinNumber , String  password) {
		System.out.println("Thank you for Login with sin Number  and Secure Password");
	}
	

}

