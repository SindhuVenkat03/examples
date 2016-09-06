package MS3.LogicalExcercise;

import java.util.Scanner;

public class PosOrNeg
{
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<0)
		{
			System.out.println("neg");
		}
		else
		{
			System.out.println("pos");
		}
	s.close();	
	}

}
