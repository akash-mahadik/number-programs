//for minimum iteration.
import java.util.Scanner;
class LCM2	{ 
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a frist number");
int num1=sc.nextInt();
System.out.println("Enter a second number");
int num2=sc.nextInt();
System.out.println("Enter a third number");
int num3=sc.nextInt();
int i=1;
int big=(num1>num2&&num1>num3)?num1:(num2>num1&&num2>num3)?num2:num3;
while(true)
{
if((big*i)%num1==0 &&(big*i)%num2==0&&(big*i)%num3==0){
System.out.println("LCM of "+num1+","+num2+" and "+num3+" is "+(big*i));
break;
}
big++;
}
}
}
