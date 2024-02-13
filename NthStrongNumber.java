import java.util.*;
class NthStrongNumber{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		int num=1,count=0, sum=0;
		while(count<no)
		{
			num++;
			
			for(int i=num;i>0;i/=10)
			{
				int last=i%10;
				
				int fact=1;
				for(int j=1;j<=last;j++)
				{
					fact*=j;
				}
				sum+=fact;
			}
			if(sum==num)
			{
				count++;
			}
		}
		System.out.println(no+"th strong number="+num);
	}
}

		
