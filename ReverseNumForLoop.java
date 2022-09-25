
import java.util.Scanner;

public class ReverseNumForLoop{

	public static void main(String[] args) {
		int forward = 0;
		int reverse = 0;

		System.out.println("Enter any number = ");

		Scanner sc = new Scanner(System.in);
		forward = sc.nextInt();

		for (; forward > 0;) {

			reverse = reverse * 10;

			reverse = reverse + forward % 10;
			forward = forward / 10;

		 }

		System.out.println("reverse of this number is = " + reverse);

	}

}
