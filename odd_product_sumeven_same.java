
import java.util.*;
public class odd_product_sumeven_same {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 System.out.println("ente a number");
	 int num=sc.nextInt();
	int e=0;
	int o=0;
	while(num>0){
		int last=num%10;
		if(last%2==0){
			e+=last;
		}
		else{
			o+=last;
		}
		num/=10;
	}
	System.out.println("sum of even digit= " +e);
	System.out.println("sum of odd digit= " +o);
	}
}
	
	