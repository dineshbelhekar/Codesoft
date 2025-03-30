package codesoft;
import java.util.Scanner;
public class Task3Atm {
	public static void main(String args[]) 
	{
		int choice,cnt=0,amount=0;
		
		Accountholder user = new Accountholder(amount);
		
		while(cnt==0)
		{
			System.out.println("1: withdraw \n2: deposite  \n3: check balance \n4: Exit ");
			System.out.println(" Enter your choice ");
			Scanner scan = new Scanner(System.in);
			choice=scan.nextInt();
		  switch(choice)
		  {
		  case 1 :
			 System.out.println(" Enter amount ");
			 amount=scan.nextInt();
			 user.withdraw(amount);
			  break;
			  
		  case 2:
			  System.out.println(" Enter amount ");
			  amount=scan.nextInt();
			  user.deposite(amount);
			  break;
			  
		  case 3:
			  user.checkbalance();
			  break;
			  
		  case 4:
			  cnt=1;
			  break;
			  
		  }
		}
	}
   
	 
	
	

}
