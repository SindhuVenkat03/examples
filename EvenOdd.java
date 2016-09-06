package MS3.LogicalExcercise;

import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the num");
		int a =s.nextInt();
		if(a % 2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}
}
