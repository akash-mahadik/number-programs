import java.util.*;
class TwinPrime{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(),prime1=2,prime2,count=0;
		int numrator=prime1+1;
		while(count<num)
		{
			int den=2;
			for(;den<numrator;den++)
			{
				if(numrator%den==0){
					break;
				}
			}
			if(numrator==den){
				prime2=numrator;
				if(prime2-prime1<=2)
				{
					System.out.println(prime1+"'"+prime2);
					count++;
				}
				prime1=prime2;
			}
			numrator++;
		}
	}
}
			
				
						