/*Duck number=A Duck number is a positive number which has zeroes present in it,
 For example 3210, 8050896, 70709 are all Duck numbers. 
 Please note that a numbers with only leading 0s is not considered as Duck Number.
 For example, numbers like 035 or 0012 are not considered as Duck Numbers.*/
 
 import java.util.Scanner;
 class DuckNumber{
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter a number");
		 int num=sc.nextInt(),r;
		 boolean flag=false;
		 while(num>0)
		 {
			 r=num%10;
			 if(r==0)
			 {
				 flag=true;
			 }
			 num/=10;
		 }
		 if(flag)
		 {
			 System.out.println("number is duck number");
		 }
		 else
		 {
			 System.out.println("number is not duck number");
		 }
	 }
 }

			 
		 
 