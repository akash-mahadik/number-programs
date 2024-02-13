import java.util.Scanner;
class Factorial_number2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int fact=1;
for(int start=1;start<=num;start++){
fact*=start;
}
System.out.println(fact);
}
}