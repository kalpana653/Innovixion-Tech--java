package calci;
import java.util.Scanner;
public class CommandLineCalci {
   public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        boolean exit = false;
		        System.out.println("Welcome to the Command-Line Calculator!!!");

		        while (!exit) {
		            System.out.println("\nChoose an operation:");
		            System.out.println("1. Addition (+)");
		            System.out.println("2. Subtraction (-)");
		            System.out.println("3. Multiplication (*)");
		            System.out.println("4. Division (/)");
		            System.out.println("5. Exit");

		            System.out.print("Enter your choice (1-5): ");
		            int wish = scanner.nextInt();

		            switch (wish) {
		                case 1:
		                    performOperation("Addition", "+");
		                    break;
		                case 2:
		                    performOperation("Subtraction", "-");
		                    break;
		                case 3:
		                    performOperation("Multiplication", "*");
		                    break;
		                case 4:
		                    performOperation("Division", "/");
		                    break;
		                case 5:
		                    exit = true;
		                    System.out.println("Exiting the calculator :)");
		                    break;
		                default:
		                    System.out.println("Invalid choice!!!Please enter a number between 1 and 5.");
		            }
		        }

		        scanner.close();
		    }

		    private static void performOperation(String operation, String operator) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("\nEnter two numbers for " + operation + ":");
		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        double result;

		        switch (operator) {
		            case "+":
		                result = num1 + num2;
		                break;
		            case "-":
		                result = num1 - num2;
		                break;
		            case "*":
		                result = num1 * num2;
		                break;
		            case "/":
		                if (num2 != 0) {
		                    result = num1 / num2;
		                } else {
		                    System.out.println("Error: Division by zero is not allowed.");
		                    return;
		                }
		                break;
		            default:
		                System.out.println("Invalid operator.");
		                return;
		        }

		        System.out.println("Result of " + operation + ": " + num1 + " " + operator + " " + num2 + " = " + result);
		    }
		


	}


