import com.AccountHolder;
import com.SavingsAccount;

public class Test {

	public static void main(String[] args) {

			
	
		SavingsAccount savingsAccount = new SavingsAccount(101, 5000, 1234);
		
		
		AccountHolder accountHolder = new AccountHolder("Hary","male", "12-12-1880");
		
		savingsAccount.setHolder(accountHolder);
		
		
		AccountHolder holder2 = savingsAccount.getHolder();
		
		System.out.println("Name : "+holder2.getName());
		
		

	}

}
