//Niven/harshad number=sum of digit squre is divisible by given number

import java.util.*;
class NivenNumber
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt(),sum=0;
	
	for(int i=num;i>0;i/=10)
	{
		int last=i%10;
		sum+=last;
	}
	if(num%sum==0)
	{
		System.out.println("Niven number");
	}
	else
	{
		System.out.println("Not niven number");
	}
}
}
