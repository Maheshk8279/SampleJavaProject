package com;

//Parent class or Super  class or Base class
public class SavingsAccount implements IAccountService {
	
	//fields or instance variables or non-static variables
	private int accountNo;
	private float balance;
	private int pin;
	
	final static float interestRate=4.25f;
	
	private AccountHolder holder;
		
	//default constructor
	public SavingsAccount() {
		
	}

	//parameterized constructor   
	                     //parameters(or local variable)
	public SavingsAccount(int accountNo, float balance, int pin) {		
		this.accountNo = accountNo;
		this.balance = balance;
		this.pin = pin;
	}

	
	
	public SavingsAccount(int accountNo, float balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public AccountHolder getHolder() {
		return holder;
	}
	
	public void setHolder(AccountHolder holder) {
		this.holder = holder;
	}

	public void getDetails(){
		System.out.println("AccountNo : "+accountNo);
		System.out.println("Balance   : "+balance);
		System.out.println("Pin       : "+pin);
	}

	public boolean validatePin(int pin){
		if(this.pin == pin){
			return true;
		}		
		return false;
	}
	
	//non-static method or instance method
	//withdraw(int)
	//withdrawal from the branch
	public void withdraw(int withdrawalAmount){
		//business logic		
		if(withdrawalAmount<=this.balance){
			this.balance = this.balance - withdrawalAmount;
		}else{
			System.err.println("You have insufficient funds");
		}		
	}
	
	@Override
	public void deposit(int depositAmount) {
		// TODO Auto-generated method stub
		
	}
	
	//withdrawal from the atm
	//withdraw(int,int)
	public void withdraw(int withdrawalAmount,int pin){
		
		if(this.pin == pin){
			
			if(withdrawalAmount <= 500){
				
				withdraw(withdrawalAmount);
				
			}else{
				System.err.println("Withdrawal limit exceeded");
			}
			
		}else{
			System.err.println("Incorrect pin");
		}
		
	}
	
	public static  float getInterestrate() {
		return interestRate;
	}
		
	
}
