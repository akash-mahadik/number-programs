import java.util.*;
class AutomorphcNUmber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt(),temp=num,count=0;
		int sq=num*num;
		int power=1;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		
		for(int i=1;i<=count;i++)
		{
			power*=10;
		} 
		
		if(sq%power==num)
		{
			System.out.println("AutomorphcNUmber");
		}
		else{
			System.out.println("Not AutomorphcNUmber");
		}
	}
}
		
