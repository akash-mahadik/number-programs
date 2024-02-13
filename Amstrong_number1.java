package number_programs;
import java.util.*;

public class Amstrong_number1 {

	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int num1=num;
	int num2=num;
	int count=0;
	int rem;
	int mul=1;
	int arms=0;
	while(num1>0){
	num1/=10;
	count++;
	}
	while(num2!=0)
	{
		rem=num%10;
		for(int i=1;i<=count;i++)
		{
			mul=mul*rem;
		}
		arms=arms+mul;
		num2/=10;
	}
	if(arms==num){
		System.out.println(arms+ "is amstrong");
	}
	else{
		System.out.println(arms+ "is not amstrong");
	}
	}
	
}