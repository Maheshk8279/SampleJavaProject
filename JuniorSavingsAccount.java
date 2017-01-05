//this is jr savings account class and parent is deleted and commited

import com.SavingsAccount;


//Child class or sub class or derived class
public class JuniorSavingsAccount extends SavingsAccount{
	
	private String gaurdianName;
	//private int pin;

	public JuniorSavingsAccount(int accountNo, float balance, int pin,String gaurdianName) {
		//invokes super class constructor
		super(accountNo, balance,pin);
		//this.pin = pin;
		this.gaurdianName = gaurdianName;
	}
	
	
	@Override
	public void withdraw(int withdrawalAmount, int pin) {		
		
		if(validatePin(pin)){
			
			if(withdrawalAmount <= 100){
				
				withdraw(withdrawalAmount);
				
			}else{
				System.err.println("Withdrawal limit exceeded");
			}
			
		}else{
			System.err.println("Incorrect pin");
		}
	}
}
