//WAP to find sum of factorial of each digit of a given number.
import java.util.*;
class Sum_fact_digit
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sum=0;
while(num>0)
{
int last=num%10;
int fact=1;
for(int i=1;i<=last;i++)
{
fact*=i;
}
sum+=fact;
num/=10;
}
System.out.println(sum);
}
}