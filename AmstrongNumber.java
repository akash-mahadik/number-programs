import java.util.*;
class AmstrongNumber
{
public static void main(String[]args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int num1=num;
length=0;
while(num1!=0)
{
num1=num1/10;
length++;
}
int num2=num;
int rem;
int arm=0;
while (num2!=0)
{
rem=num2%10;
int mul=1;
for(int i=1;i<=lenght;i++)
{
mul=mul*rem;
}
arm=arm+mul;
num/=10;
}
if(num==arm)
{
System.out.println("entered number is Amstrong");
}
else
{
System.out.println("entered number is not Amstrong");
}
}
}


