//Happy number=eventual sum of squre of digit is equal to one.

import java.util.*;
class HappyNumber{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int i,d,x;
	for(i=num;i>9;)
	{
		int s=0;
		for(x=i;x>0;x/=10)
		{
			d=x%10;
			s=s+(d*d);
		}
		
		i=s;
		
	}
	if(i==1)
	{
		System.out.println("Happy number");
	}
	else
	{
		System.out.println("Not happy number");
	}
}
}

	
