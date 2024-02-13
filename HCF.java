import java.util.*;
class HCF{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter frist number");
int num1=sc.nextInt();
System.out.println("enter second number");
int num2=sc.nextInt();
System.out.println("enter third number");
int num3=sc.nextInt();
int small=(num1<num2 && num1<num3)?num1:(num2<num1 && num2<num3)?num2:num3;
while(true)
{
if(num1%small==0 && num2%small==0 && num3%small==0)
{
System.out.println("HCF of "+num1+" , "+num2+" and "+num3+ " is "+small);
break;
}
small--;
}
}
}