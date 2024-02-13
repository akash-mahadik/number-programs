//take a number and count entered number's factor.
import java.util.*;
class Factor_count{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int count=0;
for(int din=1;din<=num;din++){
if(num%din==0){
	System.out.println(din);

count++;
}
}
System.out.println("entered number's factor count: "+count);
}
}
