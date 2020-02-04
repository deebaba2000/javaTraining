package oop;

public class BankAccount {
	String accountNumber;
	static String routingNumber = "234567";
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	BankAccount(){
		System.out.println(" NEW ACCOUNT IS CREATED ");
	}//
	
	//
	BankAccount(String accountType){
	System.out.println(" NEW ACCOUNT:" + accountType);
	}
	
	
	//
	BankAccount (String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT:" + accountType);
		System.out.println("INITAL DEPOSIT OF : $" + initDeposit);
		String Msg = null;
		if(initDeposit < 1000){
			 Msg = "ERROR: minimum deposit must be at least $1000";
		} else{
			Msg = "Thanks for your initial deposit of $" + initDeposit;
		}
			
		System.out.println(Msg);
			balance = initDeposit;
			}
		
		//
		
	
	
	
	
	
	
	void deposit(){
		
	}
	 void witdraw(double amount){
		 balance = balance + amount;
		 ShowActivity("WITHDRAW");
		 
		 
	 }
	 void checkbalance(){
		 System.out.println("Balance: " + balance);
		 
	 }
	 
	 void ShowActivity(String activity){
		 System.out.println("YOUR RECENT TRANCATION:" + amount);
		 System.out.println("Your new Balance is: $ " + balance);
		 
	 }
	  void getstatus(){
		 
	 }
	 
	 
	 @Override
	  public  String toString(){
		 return "(" + name + "." + accountNumber + "BALANCE: $" + balance +  ")";
	 }
	 

}
