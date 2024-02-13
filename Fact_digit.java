//find factorial of each digit of given number
import java.util.*;
class Fact_digit
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
while(num>0)
{
int last=num%10;
int fact=1;
for(int i=1;i<=last;i++)
{
fact*=i;
}
System.out.println(fact);
num/=10;
}
}
}