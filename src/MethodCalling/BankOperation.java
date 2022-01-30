package MethodCalling;

public class BankOperation {
//Create two classes Main class and Bank operation class.
	// Create two methods, one to deposit money into the account and another one
	// which will verify the card no and pin.
	// Call the cardVerification method in depositMoney method before depositing the
	// money

	String cardNumber = "5222222222222222";
	int pinNumber = 1100;
	double newBalance = 0.0;
	double totalAccountBal = 150.0;

	boolean cardVerification(String cardNum, int pinCode) {
		if (cardNum.equals(cardNumber) && (pinCode == pinNumber))
			;
		return true;
	}

	double depsoitMoney(double amountTobedeposit, String cardNum, int pinCode) {
		System.out.println("Welcome to Your Acc: Select Amount to be deposited " + cardVerification(cardNum, pinCode));
		System.out.println("Amount Selected " + amountTobedeposit);
		if (amountTobedeposit > 0) {
			newBalance = totalAccountBal + amountTobedeposit;

		}
		return newBalance;
	}

}
