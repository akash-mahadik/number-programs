import java.util.*;
class odd_product_sumeven_same1{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int s=0;
int p=1;
while(num>0){
int last=num%10;
if(last%2==0){
s+=last;
}
else{
p*=last;
}
num/=10;
}
System.out.println("the sum of even digit= "+s);
System.out.println("product of odd digit= "+p);
if(s==p){
System.out.println("sum of even digit and product of odd digit is same");
}
else{
System.out.println("sum of even digit and product of odd digit is not same");
}
}
}

