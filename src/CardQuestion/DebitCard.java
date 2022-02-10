package CardQuestion;
//Child class for Debit

public class DebitCard extends Card {
	
	DebitCard (){
		
	}
	
	@Override
	  public String namOnCard(String custName) {
		// TODO Auto-generated method stub
		return super.namOnCard(custName);
	}
	@Override
	public String logoOnCard(String visaLogo) {
		// TODO Auto-generated method stub
		return super.logoOnCard(visaLogo);
	}
	
	String cardNumber = "6777777777";
	int pinNumber = 1107;
	
	DebitCard (String cardNumber, int pinNumber) {
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
	}


	
	boolean cardVerification(String cardNum, int pinCode) {
		if (cardNum.equals(cardNumber) && (pinCode == pinNumber)){
			System.out.println("Enter the amt ");	
		} else {
		System.out.println("incorrect cardnumber or Pin number ");	
		}
		return true;
	}
	

}
