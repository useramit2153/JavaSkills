import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String user_input_string = scan.nextLine();
		System.out.println("The entered value is " + user_input_string);
		System.out.println("Enter some number: ");
		int user_input_number = scan.nextInt();
		System.out.println("The entered value is " + user_input_number);
		double user_input = scan.nextDouble();
		System.out.println("The entered value is " + user_input);
	}
}