//find the sum of prime numbers between the given range and check the sum is prime or not
class SumPrime{
public static void main(String[]args)
int start=1;
int end=10;
int sum=0;
while(start<=end) {
	int den=2;
	for(;den<end;den++) {
		if(start%den==0) {
			break;
		}
	}
		if(start==den) {
			System.out.println(start);
			sum+=start;
	}
		start++;
}
System.out.println(" sum of prime range: "+sum);
int densum=2;
for(;densum<sum;densum++) {
	if(sum%densum==0) {
		break;
	}
}
if(sum==densum) {
	System.out.println("sum of prime range number is prime");
}
else {
	System.out.println("sum of prime range number is not prime");

}
	}








