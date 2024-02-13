//check entered number is present in fibbo series or not
import java.util.Scanner;
class fibbo{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number to check entered number is in fibbo series: ");
int no=sc.nextInt();
int num=0;
int num1=1;
for(;;){
int ans=num+num1;
if(no==0||no==num){
System.out.println("entered number is in fibbo series");
break;
}
else if(num>no){
System.out.println("entered number is not in fibbo series");
break;
}
else{
num=num1;
num1=ans;
}
}
}
}
