package codesoft;

public class Accountholder {
	private double  balance;
	
	public Accountholder( double initialbalance)
	{
		balance=initialbalance;
	}
	
	public void withdraw(int amount)
	{
		if(amount > balance)
		{
			System.out.println(" you have insufficient balance ");
			
		}
		else
		{
			balance = balance-amount;
		}
	}
	
	public void deposite(int amount )
	{
		 balance =balance+amount;
		 System.out.println(" amount is deposited ");
	}
	public void checkbalance()
	{
		System.out.println(" your account balance is :"+balance);
	}

}
