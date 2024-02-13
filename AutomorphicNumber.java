//Automorphic number= a number who's squre ends in same digit as the number itself.
import java.util.*;
class AutomorphicNumber{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sq=num*num;
int len=0,base=10,power=1;
for(int t1=num;t1>0;t1/=10){
len++;
}
for(int b=1;b<=len;b++){
power*=base;
}
int m=sq%power;
if(m==num){
System.out.println("entered number is Automorphic number");
}
else{
System.out.println("entered number is not Automorphic number");
}
}
}



