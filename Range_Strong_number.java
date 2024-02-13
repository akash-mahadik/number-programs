public class Range_Strong_number {
public static void main(String[] args) {
	int start=1,end=1000,sum=0;
	int temp=start;
	int temp1=start;
	while(start<=end) {
	while(temp!=0)
	{
	int last=temp%10;
	int fact=1;
	for(int i=1;i<=last;i++)
	{	
	fact*=i;
	}
	sum+=fact;
	temp/=10;
	}
	
	if(temp1==sum){
		System.out.println(sum);
		
	}
	start++;
	}
}
}