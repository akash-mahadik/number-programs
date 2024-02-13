import java.util.*;
class AAmstrong_Range{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a starting number");
		int start=sc.nextInt();
		System.out.println("Enter a starting number");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			int count=0;
		for(int j=i;j>0;j/=10)
		{
			count++;
		}
		int sum=0;
		for(int num=i;num>0;)
		{
			int last=num%10;
			int power=1;
			for(int k=0;k<count;k++)
			{
				power*=last;
			}
			sum+=power;
			num/=10;
		}
		if(i==sum){
			
			System.out.println(i);
		}
		}
	}
}
			
		