import java.util.Scanner;

class WhileReverseNum {
	public static void main(String[] args) {

		int num, rev;
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		// run loop for positive numbers only...
		System.out.print("its reverse  is = ");
		while (num > 0) {
			// get last digit from num
			rev = num % 10;
			
			System.out.print(rev);
			
			// remove the last digit from num
			num = num / 10;
			
		}
		
	}
}
		

