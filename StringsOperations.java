/**
 *
 */
package day2;

/**
 * @author sley_x-team
 *
 */
public class StringsOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declaring variables;
		String intro;
		String firstName;
		String nickName;
		String lastName;

		// Declaring some int variables to perform some computation.
		int num1;
		int num2;
		int num3;

		intro = "My name is ";
		firstName = "Paul-Wesley";
		nickName = "Sley";
		lastName = "Jeanty";

		System.out.println("The No of character that composed intro is: " + intro.length());
		System.out.println("The No of character that composed firstName is: " + firstName.length());
		System.out.println("The No of character that composed Nickname is: " + nickName.length());
		System.out.println("The No of character that composed lastName is: " + lastName.length());
		System.out.print("\"My name is Wesley.\" has ");
		System.out.println("My name is Wesley.".length() + " characters.");

		num1 = intro.length();
		num2 = nickName.length();
		num3 = num1 * num2;

		System.out.println("The No of character of intro "
				+ "* the No of character in nickName is " + num3);

		System.out.println(intro.equals(firstName));
		System.out.println(lastName.equalsIgnoreCase(nickName));
		System.out.println(intro.charAt(4));
		System.out.println(lastName.substring(3));
		System.out.println(intro.trim());
		System.out.println(firstName.toUpperCase());
		System.out.println(nickName.toLowerCase());
		System.out.println(intro.trim().length());

	}

} // end of StringsOperations
