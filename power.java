import java.util.Scanner;
class power{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a base");
int base=sc.nextInt();
System.out.println("enter a raise");
int raise=sc.nextInt();
int power=1;
for(int i=0;i<raise;i++){
power*=base;
}
System.out.println(power);
}
}

