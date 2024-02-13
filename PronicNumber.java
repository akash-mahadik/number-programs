import java.util.*;
class PronicNumber{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int i=1;
while(true){
int ans=i*(i+i);
if(ans==num){
System.out.println("entered number is pronic number");
break;
}

else if(ans>num){
System.out.println("entered number is not pronic number");
break;
}
else{
	i++;
}
}}

