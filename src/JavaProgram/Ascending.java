package JavaProgram;

import java.util.Scanner;

public class Ascending {
	
	public static void main(String[] args)
	{
	int n, temp;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements you want in array");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the all number");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
	System.out.println("Ascending order");
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]+"");
		
	}
	System.out.println(a[a.length-2]);
	}
}