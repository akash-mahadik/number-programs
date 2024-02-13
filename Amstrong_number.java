package number_programs;
import java.util.*;
public class Amstrong_number {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	int sum = 0;
//int a=153;
	int b = a;
	int d = a;
	int c=0;
	while(b > 0)
	{
		c++;
		b /= 10;
	}
	//int num2=num;
	int rem;
	//int arm=0;
	while(d!=0)
	{
		rem=d % 10;
		int multi=1;
		for(int i=1;i<=c;i++)
		{
			multi=multi*rem;
		}
		sum += multi;
		d/=10;
	}
	if(sum==a)
		{
			System.out.println(a+"num is amstrong");
		
		}
		else {
		System.out.println("num is not amstrong");
		}
}
}
