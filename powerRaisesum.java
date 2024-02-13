import java.util.*;
public class powerRaisesum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	System.out.println("enter a raise");
	int raise=sc.nextInt();

	int last;
	int sum=0;

	while(num>0) {
		last=num%10;
		int power=1;

	for(int i=0;i<raise;i++) {
		power*=last;
	}
sum+=power;
num/=10;
}
	System.out.println(sum);
}
}
