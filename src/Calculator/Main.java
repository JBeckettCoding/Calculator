// A basic calculator program

// Modules
package Calculator;
import java.util.Scanner;

// Main Class
public class Main extends Operators{
	
	public static void main(String[] args) {
		// Main Code
		// Creates two integers to be used as the main numbers
		int num1;
		int num2;
		
		// Creates a string for the operator that will choose the function
		String operator;
		
		// Creates an input object
		Scanner opInput = new Scanner(System.in);
		
		// Asks for input and then assigns the input to a string
		System.out.print("Please enter the operator that you want to use: ");
		operator = opInput.nextLine();
		
		// Creates an input object
		Scanner input = new Scanner(System.in);
				
		// Asks for input and then assigns the input to an integer variable
		System.out.print("Please enter the first integer: "); 
		num1 = input.nextInt();
						
		// Asks for input and then assigns the input to an integer variable
		System.out.print("Please enter the second integer: ");
		num2 = input.nextInt();
		
		// Checks the operator
		if (operator.equals("+")) {
			// Prints the result
			System.out.println("Your answer is: " + num1 + " + " + num2 + " = " + Addition(num1, num2));
		// Checks the operator
		} else if (operator.equals("-")) {
			// Prints the result
			System.out.println("Your answer is: " + num1 + " - " + num2 + " = " + Subtraction(num1, num2));
		// Checks the operator
		} else if (operator.equals("*")) {
			// Prints the result
			System.out.println("Your answer is: " + num1 + " x " + num2 + " = " + Multiplication(num1, num2));
		// Checks the operator
		} else if (operator.equals("/")) {
			// Prints the result
			System.out.println("Your answer is: " + num1 + " / " + num2 + " = " + Division(num1, num2));
		// Checks the operator	
		} else {
			// Catches the wrong operator
			System.out.println("Please enter a correct operator");
		}
				
		// Closes input
		input.close();
		opInput.close();
	}
}
