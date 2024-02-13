import java.util.Scanner;
class pallindrome{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int num1=num;
int rev=0;
while(num>0){
int last=num%10;
rev=(rev*10)+last;
num/=10;
}
if(num1==rev){
System.out.println("entered number is pallindrome");
}
else{
System.out.println("entered number is not pallindrome");
}

}
}