//Neon number=sum of digit squre is equal to give number.

import java.util.*;
class NeonNumber{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int sq=num*num,i,sum=0,last;
	for( i=sq;i>0;i/=10)
	{
		last=i%10;
		sum=sum+last;
	}
	if(sum==num)
	{
		System.out.println("neon number");
	}
	else
	{
		System.out.println(" not neon number");
	}
}
}
		
	