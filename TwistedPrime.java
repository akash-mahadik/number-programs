//if it is a prime number and reverse of the number is also prime number

import java.util.*;
class TwistedPrime{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		int den=2;
		while(den<num)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		if(num==den)
		{
			int rev=0;
			while(num>0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			int den1=2;
			while(num<rev){
				if(rev%den1==0)
				{
					break;
				}
				den1++;
			}
			if(rev==den1)
			{
			 System.out.println("number is twisted prime");
			}
			else{
				System.out.println("number is not twisted prime");
			}
		}
			else{
				System.out.println("not prime number");
		}
		
	}
}
				
		
