package oop;

public class BankAccountApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount  acc1 = new BankAccount();
		acc1.accountNumber = "5556655";
		acc1.name = "damilola";
		acc1.balance = 1000;
		System.out.println(acc1.toString());
		
		BankAccount  acc2 = new BankAccount("checking account");
		acc2.accountNumber = "26677";
		
		BankAccount  acc3 = new BankAccount("savings account", 5000);
		acc3.accountNumber = "23456";
		acc3.checkbalance();
		
		
		//Demo for inheritance
		DAccount da1 = new DAccount();
		da1.balance = 3000;
		da1.name ="john";
		da1.accountType = "DAccount";
		System.out.println(da1.toString());
		
		

}
} 
