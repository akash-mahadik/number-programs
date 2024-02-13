//A number is said to be unique if and only if the digits are not duplicate ex-12,9864,56
//not unique ex-1334,1010,33,121

import java.util.Scanner;
class UniqueNumber{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int i;
		while(num!=0)
		{
			int last=num%10;
			num/=10;
		for( i=num;i!=0;i/=10)
		{
			if(i%10==last)
			{
				break;
			}
		}
		if(i>0)
		{
			break;
		}
		}
		if(num==0)
		{
			System.out.println("unique number");
		}
		else{
			System.out.println("not unique number");
		}
	}
}
		
