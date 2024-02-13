import java.util.*;
class StrongNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(),temp=num,len=0,sum=0;
		while(temp>0)
		{
			temp/=10;
			len++;
		}
		for(int i=num;i>0;)
		{
			int last=i%10;
			int power=1;
			for(int j=1;j<=last;j++)
			{
				power*=j;
			}
			sum+=power;
			i/=10;
		}
		if(sum==num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}

