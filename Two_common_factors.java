import java.util.*;
public class Two_common_factors {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter number");
	int num1=sc.nextInt();
	System.out.println("enter number");
    int num2=sc.nextInt();
    for(int din=1;din<=(num1<num2?num1:num2);din++) {
    if(num1%din==0&&num2%din==0) {
    	System.out.println(din);
    }
    }
}
}
        