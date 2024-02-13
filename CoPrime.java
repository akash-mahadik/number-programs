//pairs of number that do not have any common factor other than 1.
import java.util.*;
class CoPrime{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a frist number");
		int num1=sc.nextInt();
		System.out.println("enter a second number");
		int num2=sc.nextInt();
		int small=(num1<num2)?num1:num2;
		while(true){
			if(num1%small==0 && num2%small==0)
			{
				break;
			}
			small--;
		}
		if(small==1)
		{
			System.out.println("CoPrime Number");
		}
		else{
			System.out.println("Not CoPrime Number");
		}
	}
}
				
		
