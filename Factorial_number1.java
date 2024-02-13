import java.util.Scanner;
class Factorial_number1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int fact=1;
for(int start=num;start>0;start--){
fact*=start;
}
System.out.println(fact);
}
}