import java.util.*;
class NthFibboNumber{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		int num1=0,num2=1,ans;
		for(int i=0;i<no;i++)
		{
			ans=num1+num2;
			num1=num2;
			num2=ans;
		}
		System.out.println(no+"th fibbo number="+num1);
	}
}
			
	
