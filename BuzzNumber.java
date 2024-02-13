//BuzzNumber=a number is ends with zero or divisible by 7
import java.util.Scanner;
class BuzzNumber{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
if(num%10==7||num%7==0)
{
System.out.println("number is buzz number");
}
else
{
System.out.println("number is not buzz number");
}
}
}