import java.util.Scanner;
public class Range_Amstrong_number{
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a start");
		int start = scanner.nextInt();
			System.out.println("enter a end");

		int end = scanner.nextInt();

		for (int i = start; i <= end; i++) {
			int count = 0;
			for (int j = i; j > 0; j /= 10) {
				count++;
			}
			int sum = 0;
			for (int num = i; num > 0;) {
				int last = num % 10;
				int power = 1;
				for (int k = 0; k < count; k++) {
					power *= last;
				}
				sum += power;
				num /= 10;
			}
			
			if (i==sum) {
				System.out.println("Armstrong number =" +  i);
			} 
		}
}
}