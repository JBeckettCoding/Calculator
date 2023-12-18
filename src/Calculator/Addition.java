// Program to add two numbers together

// Modules
package Calculator;
import java.util.Scanner;

// Main Code
public class Addition {

	public static void main(String[] args) {
		// Creates two integers to be used as the main numbers
		int num1;
		int num2;
		
		// Creates an input object
		Scanner input = new Scanner(System.in);
		
		// Asks for input and then assigns the input to an integer variable
		System.out.print("Please enter the first integer: "); 
		num1 = input.nextInt();
				
		// Asks for input and then assigns the input to an integer variable
		System.out.print("Please enter the second integer: ");
		num2 = input.nextInt();
		
		// Adds the two integers and prints the result
		System.out.println("Your answer is: " + num1 + " + " + num2 + " = " + (num1 + num2));
		
		// Closes the input
		input.close();
		
	}
	

}
