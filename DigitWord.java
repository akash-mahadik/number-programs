//digit to words in java
import java.util.*;
class DigitWord{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
	System.out.println("enter a nmber");
	int num=sc.nextInt();
	int n=num,r;
	String digitword="";
	while(num>0) {
		 r=num%10;
		switch (r) 
		{
		case 0: 
			digitword="zero " + digitword;
			break;
		case 1: 
			digitword="one " + digitword;

			break;
		case 2: 
			digitword="two " +digitword;
			break;
		case 3: 
			digitword="three " + digitword;
			break;
		case 4: 
			digitword="four " + digitword;
			break;
		case 5: 
			digitword="five " + digitword;
			break;
		case 6: 
			digitword="six " + digitword;
			break;
		case 7: 
			digitword="seven " + digitword;
			break;
		case 8: 
			digitword="eight " + digitword;
			break;
		case 9: 
			digitword="nine " + digitword;
			break;
		
		}
		num=num/10;
		
	}
	System.out.println("digit=" + n);
	System.out.println("words= " + digitword);


}
}