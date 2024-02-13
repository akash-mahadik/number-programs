public class Amsrong_number4 {

	public static void main(String[] args) {
      int num=153;
      int temp=num;
     int length=0;
      while(temp!=0) {
    	  length++;
    	  length=num/10;
      }
      int arm=0,temp1=num;
      while(temp>0) {
		  int mul=1;
    	  int rem=temp%10;
    	  for(int i=1;i<=length;i++) {
    		 mul*=rem; 
    	  }
    	  arm+=mul;
    	  temp1/=10;
      }
      if(num==arm) {
    	  System.out.println("enter number is amstrong number");
      }
      else {
    	  System.out.println("entered number is not amstrong");
      }
      	
	}

}
