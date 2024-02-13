import java.util.*;
class Factors_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
for(int din=1;din<=num;din++){
if(num%din==0){
System.out.println(din);
}
}
}
}
