/**
 * 
 */
package day6;
import java.util.Scanner;
/**
 * @author sleys
 *
 */


public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        
            int num = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            scanner.close();
            int age = (num * 70 + num2 * 21 + num3 * 15) % 105;
            System.out.println("Your age is " + age + "; that's a good time to start programming!");
        

        
    }
}
