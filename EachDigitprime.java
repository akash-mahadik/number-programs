//print all the prime digit of a given number
import java.util.*;
class EachDigitprime{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int last;
while(num>0)
{
last=num%10;
int den=2;
for(;den<=last;den++)
{
if(last%den==0){
break;
}
}
if(last==den){
System.out.println(last);
}
num/=10;

}
}
}
