import java.util.Scanner;
class Sum_of_evenodd_digit{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int es=0;
int os=0;
while(num>0){
int last=num%10;
if(last%2==0){
es+=last;
}
else{
os+=last;
}
num/=10;
}
System.out.println("the sum of even digit= "+es);
System.out.println("the sum of odd digit= "+os);
}
}