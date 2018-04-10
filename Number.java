import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = scanner.nextInt();
		if(num >= 0) {
			System.out.print("Position Number");
		}
		else {
			System.out.print("Negative Number");
		}
	}

}
