import java.util.Scanner;
class Fibbonacci{
public static void main(String[]args){
Scanner strike=new Scanner(System.in);
System.out.println("Enter a number");
int no=strike.nextInt();
int num=0;
int num1=1;
for(int i=0;i<no;i++){
int ans=num+num1;
System.out.println(num);
num=num1;
num1=ans;
}
}
}


