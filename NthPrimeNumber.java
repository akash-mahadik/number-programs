import java.util.*;
class NthPrimeNumber{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		int no=sc.nextInt(),count=0,i,num=1;
		while(count<no)
		{
			num++;
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			if(num==i)
			{
				count++;
			}
		}
		System.out.println(no+"th prime number="+num);
	}
}