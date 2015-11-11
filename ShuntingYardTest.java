package week2;
import java.util.Scanner;

public class ShuntingYardTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the infix expression:: ");
		String infix = scanner.nextLine(); // "3 + 4 * 2 / ( 1 - 5 ) ^ 2 ^ 3"
		String postfix = ShuntingYard.postfix(infix);
		double finalresult = Calculator.eval(postfix);

		System.out.println("Infix:: " + infix);
		System.out.println("Postfix:: " + postfix);
		System.out.println("Result:: " + finalresult);

		scanner.close();
	}
}
