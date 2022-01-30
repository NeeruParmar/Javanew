package MethodCalling;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOperation bankOperation = new BankOperation();
		double newtotalAccountBal = 10;
		double amountTobedeposit = 10;

		double depositMoney = bankOperation.depsoitMoney(10, "5222222222222222", 1100);
		if (depositMoney > 0) {
			System.out.println("New Balance" + (newtotalAccountBal + amountTobedeposit));
		} else {
			System.out.println("No deposit done:");
		}

	}

}
