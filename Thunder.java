//WAP to check sum of digit and last  digit's factorial is same or not of a given number.
import java.util.*;
class Thunder{
public static void main(String [] args){
	Scanner hydra=new Scanner(System.in);
	System.out.println("enter a number");
	int num=hydra.nextInt();
	int num1=num;
	int sum=0,fact=1,strike,last_digit=0;
	while(num>0){
		strike=num%10;
		sum+=strike;
		num/=10;	
	}
	System.out.println("sum of digit: "+sum);

		last_digit=num1%10;
		
	for(int i=1;i<=last_digit;i++) {
		fact*=i;
	}
	System.out.println("factorial of last digit: "+fact);
	if (fact==sum) {
		System.out.println("sum of digit and factorial of last digit is same");
	}
	else {
		System.out.println("sum of digit and factorial of last digit is not same");

	}
}
}