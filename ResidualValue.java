package edu.B;

import java.util.Scanner;

public class ResidualValue 
{	
	public static int isPrime(int num)
	{
		for(;num>1;num--)
		{
			int count = 0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
				
			}
			
			if(count==0)
			{
				break;
			}
		}
		
		return num;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)	
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			int num1 = isPrime(a[i]);
			int residualvalue = a[i]-num1;
			if(num1==a[i])
			{
				System.out.println("No of moves = 1("+num1+"), Residual value is "+residualvalue);
			}
			else if(a[i]==num1+1)
			{
				System.out.println("No of moves = 1("+num1+"), Residual value is "+residualvalue);
			}
			else
			{
				int num2 = isPrime(residualvalue);
				residualvalue-=num2;
				System.out.println("No of moves = 2("+num1+","+num2+"), Residual value is "+residualvalue);
			}
		}
	}

}
