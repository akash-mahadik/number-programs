import java.util.*;
class Prime_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int din=2;
for(;din<num;din++){
if(num%din==0){
break;
}
}
if(num==din){
System.out.println("Entered number is prime");
}
else{
System.out.println("Entered number is not prime");
}
}
}
