package codesoft;
import java.util.Random;
import java.util.random.*;
import java.util.Scanner;
public class Task1Guessnumber {
	public static void main(String args[])
	{
		
		
		System.out.println("You have 6 chance to guess the number\n");
		
		for(int i=1;i<4;i++)
		{
			int generated=generatenumber();
			System.out.println("guess the number between 0-99\n");
			   for(int j=0;j<6;j++)
			   {
				  
			     int user =usersnumber();
			    if( check( generated, user)>0)
			    	
			    	break;   	 
			  }
			   System.out.println("round "+i +" is complete ready for next ");
		}
		
	}
	static int generatenumber()
	{
		Random random= new Random(); 
		return random.nextInt(100);
	}
	
	static int usersnumber()
	{
		Scanner scan=new Scanner(System.in);
		return scan.nextInt();
	}
	static int check(int generated, int user)
	{
		int i=0;
		if(generated==user)
		{
			System.out.println("wow! your guess is correct \n");
			return i+1;
		}
		else if(generated>user)
		{
			System.out.println("your guess is too low ");
		}
		else
		{
			System.out.println("your guess is too high");
		}
		
		return -1;
	}
	

}
