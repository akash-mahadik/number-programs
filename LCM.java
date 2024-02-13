import java.util.*;
class LCM{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter frist number");
int num1=sc.nextInt();
System.out.println("enter secoond number");
int num2=sc.nextInt();
int big=num1>num2?num1:num2;
while(true){
if(big%num1==0&&big%num2==0){
System.out.println("LCM of "+num1+" and "+num2+" is " +big);
break;
}
big++;
}
}
}

