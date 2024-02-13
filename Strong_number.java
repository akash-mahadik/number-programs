//Strong Number=>each digits factorial sum is equal to given number
import java.util.*;
class Strong_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int temp=num;
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
if(temp==sum){
System.out.println("entered number is strong number");
}
else
{
System.out.println("entered number is not strong number");
}
}
}