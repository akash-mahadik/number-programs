public class Digit_of_sum_fibbo {

	public static void main(String[] args) {
		int num=1234;
		int last1=0;
		while(num>0) {
			int last=num%10;
			last1+=last;
			num/=10;
		}
		 System.out.println(last1);
        int fnum1=0;
        int fnum2=1;
         for(;;) {
    	   int sum=fnum1+fnum2;
    	   if(fnum1==last1) {
    		   System.out.println("sum of digit is in fibbo series");
    		   break;
    	   }
    	   else if(num>last1) {
    	   System.out.println("sum of digit is not in fibbo series");
    	   break;
       }
    	   else {
    		   fnum1=fnum2;
    		   fnum2=sum;
    	   }
	}
	}
}

