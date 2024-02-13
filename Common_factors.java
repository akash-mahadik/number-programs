//take two numbers print all common factors of both number
import java.util.*;
class Common_factors{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a frist number");
int num1=sc.nextInt();
System.out.println("enter a second number");
int num2=sc.nextInt();
for(int din=1;din<=(num1<num2?num1:num2);din++){
if(num1%din==0&&num2%din==0){
	System.out.println(+din);

}
}

}
}