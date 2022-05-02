package Part3;

import java.util.Scanner;

public class ArrayAndMagicNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int gi = 0;
		int bi = 0;
		int[] a = new int[size];
		int[] b = new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		
		int temp;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
				gi+=b[i];
			else
				bi+=b[i];
		}
		System.out.println(gi-bi);
		
		
		

	}

}
