//WAP to check sum of digit and product of a digit is present in fibbonacci series
import java.util.*;
public class Digit_sum_product_in_fibbo_series {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int sum=0,product=1;
	while(num>0) {
		int nitro=num%10;
		sum+=nitro;
		product*=nitro;	
		num/=10;
	}
	System.out.println("sum of digit: "+sum);
	System.out.println("product of digit: "+product);
	int fn=0,fn1=1,ans;
	for(;;) {
		ans=fn+fn1;
		if (ans==sum||sum==0)  {
			System.out.println("sum is in fibbo");
			break;
		}
		else if (ans>sum) {
			System.out.println("sum is not in fibbo series");
			break;
		}
			else {
				fn=fn1;
				fn1=ans;
			}
		
		for(;;) {
			ans=fn+fn1;
			if (ans==product)  {
				System.out.println("product is in fibbo");
				break;
			}
			else if (ans>product) {
				System.out.println("product is not in fibbo series");
				break;
			}
				else {
					fn=fn1;
					fn1=ans;
				}
	
	}
}
}
}
