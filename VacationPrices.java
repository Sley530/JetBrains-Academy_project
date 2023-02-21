/**
 *
 */
package day6;
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
		int duration = scanner.nextInt();
		int food = scanner.nextInt();
		int flight = scanner.nextInt();
		int night = scanner.nextInt();
		scanner.close();

		int result = (food * duration) + (flight * 2) + night * (duration - 1);

		System.out.println(result);
	}
}
