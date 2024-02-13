import java.util.*;
class AmstoNumber
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt(),temp=num,len=0,sum=0;
while(temp>0)
{
temp/=10;
len++;
}
for(int i=num;i>0;)
{
int last=i%10;
int power=1;
for(int j=0;j<len;j++)
{
power*=last;
}
sum+=power;
i/=10;
}
if(num==sum){
System.out.println("Amstrong number");
}
else{
System.out.println("Not amtrong number");
}
}
}

