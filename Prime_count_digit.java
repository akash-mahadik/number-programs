//count of prime digit in given number
import java.util.*;
class Prime_count_digit
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int last;
int count=0;
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
count++;
}
num/=10;
}
System.out.println(count);

}
}