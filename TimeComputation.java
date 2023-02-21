package day2;

// 09/24/2022 \\

/* Regarding the textbook Eck (2019) I will practice with this program
 * that perfoms some mathmatical computations and displays the results.
 * It also displays the value of the constant Math.PI.
 * It reports the number of seconds that the computer spent on this task.
 */
public class TimeComputation {
	
	public static void main (String[] arg) {
		
		//Declaring variables
		long startTime; // Starting time of the program, in nanoseconds for more accurate timing.
		long endTime; 	// Time when computations are done, in nanoseconds.
		long compTime;	// Run time in nanoseconds.
		double seconds; 	// Time difference, in seconds.
		
		startTime = System.nanoTime();
		
		double width, height, hypotenuse; // sides of a triangle
		width = Math.pow(42.0, 2);
		height = Math.pow(17.0, 2);
		hypotenuse = Math.sqrt(width + height);
		System.out.print("A triangle with sides 42 & 17 has hypotenuse ");
		System.out.println(hypotenuse);
		
		System.out.println("\nMathematically, sin(x) * sin(x) + " 
		        + "cos(x) * cos(x) - 1 should be 0.");
		System.out.println("Let's check this for x = 100:");
		System.out.print(" 		sin(100) * sin(100) + cos(100) * cos(100)- 1 is: ");
		System.out.println(Math.sin(100) * Math.sin(100) 
				+ Math.cos(100) * Math.cos(100) - 1);
		System.out.println("(There can be round-off errors when" 
				+ " computing with real numbers!)");
		
		System.out.print("\nHere is a random number: ");
		System.out.println(Math.random());
		
		System.out.print("\nThe value of Math.PI is: ");
		System.out.println(Math.PI);
		
		endTime = System.nanoTime();
		compTime = endTime - startTime;
		seconds = compTime / 1_000_000_000.0;
		
		System.out.print( "\nRun time in nanoseconds was: ");
		System.out.println(compTime);
		System.out.println("(This is probably not perfectly accurate!)");
		System.out.print("\nRun time in seconds was: ");
		System.out.println(seconds);
			
	} // end of main

} // end of class TimeComputation
