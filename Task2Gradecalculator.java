package codesoft;
import java.util.Scanner;
public class Task2Gradecalculator {
	public static void main(String args[]) {
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the total no of subjects ");
		n=scan.nextInt();
		
		int total=calculatemarks(n);
		float average= average(total,n);
		grade(total,average);
	}
	
	
	static int calculatemarks(int subjects)
	{
		int total=0;
		Scanner scan = new Scanner(System.in);
		
		   for(int i=1;i<=subjects;i++)
		     {
		       System.out.println("enter the marks obtain in "+ i +" subject");
		       total= total+scan.nextInt();
		     }
		return total;
		
	}
	
	
	static float average(int total, int subjects)
	{
	    float average=total/subjects;
	    return average;
	}
	
	static void grade(int total, float average)
	{
		System.out.println(" the total marks you got are :"+ total);
		System.out.println(" the average you got is :"+ average);
		
		if(average>90)
		{
			System.out.println(" the grade you got is : A+");
		}
		else if(average >80)
		{
			System.out.println(" the grade you got is : A");
		}
		else if(average >70)
		{
			System.out.println(" the grade you got is : B+");
		}
		else if( average >60)
		{
			System.out.println(" the grade you got is : B");
		}
		else if( average >50)
		{
			System.out.println(" the grade you got is : C");
		}
		else if( average > 40) 
		{
			System.out.println(" the grade you got is : D");
		}
		else
		{
			System.out.println(" YOU ARE FAIL !!");
		}
	
			
		
	}

}
