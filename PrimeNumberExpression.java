package Demo;

import java.util.Scanner;

public class PrimeNumberExpression 
{
	public static int checkPrime(int n)
	{
		int is_prime = 1;
		if(n==0 || n==1)
			is_prime = 0;
		else
		{
			
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					is_prime = 0;
					break;
				}
			}
		}
		return is_prime;
	}
	public static void main(String[] args) 
	{
		
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			if(checkPrime(i)==1)
			{
				if(checkPrime(num-i)==1)
				{
					System.out.println(num +" = "+i+" + "+(num-i));
					flag = 1;
				}
			}
		}
		if(flag==0)
			System.out.println("No numbers");
	}

}
