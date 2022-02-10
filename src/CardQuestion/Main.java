package CardQuestion;

import MethodCalling.BankOperation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DebitCard obj=new DebitCard ();
		String namOnCard = obj.namOnCard("John Smith");
		String logoOnCard = obj.logoOnCard("visaLogo");
		
		
		obj.cardVerification("6777777777", 110);
						
		System.out.println("Name on Card "+ namOnCard);
		System.out.println("Logo On Credit Card "+ logoOnCard);
	

	}

}
