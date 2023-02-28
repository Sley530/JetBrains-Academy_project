/**
 *
 */
//package day6;
import java.util.Scanner;

/**
 * This is a simple program to calculate the price of
 * a whole vacation time period.
 *
 * @author sleys
 *
 */
public class VacationPrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====================================================");
		System.out.println("Please enter the following information".toUpperCase());
		System.out.print("Duration = ");
		int duration = scanner.nextInt();
		System.out.print("Food = $");
		int food = scanner.nextInt();
		System.out.print("Flight = $");
		int flight = scanner.nextInt();
		System.out.print("Night = $");
		int night = scanner.nextInt();
		System.out.println("====================================================");
		scanner.close();

		int result = (food * duration) + (flight * 2) + night * (duration - 1);

		System.out.println("====================================================");
		System.out.println("Overall your vacation time will cost you: $" + result);
		System.out.println("====================================================");

		System.out.println("HAPPY VACATION!\nENJOY!!!");
	}
}
