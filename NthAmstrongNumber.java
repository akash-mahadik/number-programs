import java.util.*;
class NthAmstrongNumber{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		int num=1,count=0;
		while(count<no)
		{
		 num++;
		 int count1=0;
		 for(int i=num;i>0;i/=10){
			 count1++;
		 }
		 int sum=0;
		 for(int j=num;j>0;)
		 {
			 int last=j%10;
			 int power=1;
			 for(int k=0;k<count1;k++)
			 {
				 power*=last;
			 }
			 sum+=power;
			 j/=10;
		 }
		 if(sum==num){
			 count++; 
		 }
		}
		 System.out.println(no+"th Amstrong Number="+num);
	}
}
		
