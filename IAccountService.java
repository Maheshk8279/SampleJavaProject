package com;

public interface IAccountService {
	
	public static final int i = 10;
	
	public abstract void withdraw(int withdrawalAmount);
	
	public void withdraw(int withdrawalAmount,int pin);
	
	public void deposit(int depositAmount);

}
