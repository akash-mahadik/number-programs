import java.util.Scanner;
class Reverse_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int rev=0;
while(num>0){
int last=num%10;
rev=(rev*10)+last;
num/=10;
}
System.out.println(rev);
}
}
