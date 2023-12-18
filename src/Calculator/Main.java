package Calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
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
		
		if (operator.equals("+")) {
			// Adds the two integers and prints the result
			System.out.println("Your answer is: " + num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (operator.equals("-")) {
			// Subtracts the two integers and prints the result
			System.out.println("Your answer is: " + num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (operator.equals("*")) {
			// Multiplies the two integers and prints the result
			System.out.println("Your answer is: " + num1 + " x " + num2 + " = " + (num1 * num2));
		} else if (operator.equals("/")) {
			// Divides the two integers and prints the result
			System.out.println("Your answer is: " + num1 + " / " + num2 + " = " + (num1 / num2));
		} else {
			// Catches the wrong operator
			System.out.println("Please enter a correct operator");
		}
		
		
		// Closes input
		input.close();
		opInput.close();
	}
}
