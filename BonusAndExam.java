/**
 * @author Van
 * @version 1.0
 * @since 2024/02/21
 */

import java.util.Scanner;

public class BonusAndExam {
	// Function that calculates the salary bonus
	public static float salaryBonusCalculator(float years, float salary) {
		// Initiate the bonus variable
		float salaryBonus = -1f;

		// Check if the years is greater than 5
		if (years > 5) {
			// Returns salary bonus
	  		return salaryBonus = salary * 0.05f;
		// Returns placeholder value (meaning they have less than 5 years of experience)
		} else {
			return salaryBonus;
		}
	}

	// Function that calculates whether or not the student can attend the exam
	public static boolean examAttendance(float classes, float classesAttended) {
		// Calculates attendance percentage
		float attendancePercentage = classesAttended / classes;

		// Returns true or false depending on whether or not the student can attend the exam
		return (attendancePercentage > 0.75);
	}

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Initialize programChoice Variable
		int programChoice = 0;

		// Asks user if they want to exit program
		System.out.println("If you want to quit the program, type 'quit'.");
		System.out.println("Otherwise, press any key to continue.");

		// Gets user's quit response
		String userQuit = scanner.nextLine();
		
		// IF the user does not want to quit yet
		while (!userQuit.equals("quit")) {
			// Checks for errors
			try {
				// Asks user for program choice
				System.out.print("Enter 1 to use the work bonus check program OR Enter 2 to use the exam program: ");
				// Read the radius from the user
				programChoice = scanner.nextInt();

				// Checks if the user entered 1
				if (programChoice == 1) {
					// Gets user salary
					System.out.println("Enter your salary: ");
					float userSalary = scanner.nextFloat();

					// Gets user years of experience
					System.out.println("Enter the number of years you have worked here: ");
					float userYears = scanner.nextFloat();

					// If user entered negative number
					if (userSalary < 0 || userYears < 0) {
						System.out.println("You cannot enter negative numbers!");
					// Valid input
					} else {
						// Calls function to calculate salary
						float userBonus = salaryBonusCalculator(userYears, userSalary);

						// IF the user has worked long enough
						if (userBonus != -1) {
							System.out.println("You have earned a salary bonus because you have worked here for more than 5 years.");
							System.out.println("Your salary bonus is " + userBonus + "$");
						// IF the user has NOT worked long enough
						} else {
							System.out.println("You have not earned a salary bonus.");
							System.out.println("You have not worked more than 5 years here.");
						}
					}
				// IF user selects exam program (2)
				} else if (programChoice == 2) {
					// Gets the number of classes
					System.out.println("Enter the number of classes held: ");
					int numClass = scanner.nextInt();

					// Gets number of classes attended
					System.out.println("Enter the number of classes attended: ");
					int numClassesAttended = scanner.nextInt();

					// If user entered negative number
					if (numClass < 0 || numClassesAttended < 0) {
						System.out.println("You cannot enter negative numbers!");
					// Valid input
					} else {
						// Calls function to calculate attendance
						boolean userAttend = examAttendance(numClass, numClassesAttended);

						// IF the user can attend the exam
						if (userAttend) {
							System.out.println("You can attend the exam.");
						// IF the user cannot attend the exam
						} else {
							System.out.println("You cannot attend the exam.");
						}
					
					}
	
				}
				// Asks user if they want to exit program
				System.out.println("If you want to quit the program, type 'quit'.");
				System.out.println("Otherwise, press any key to continue.");
				scanner.nextLine();
				userQuit = scanner.nextLine();
			} catch (Exception e) {
				// If an exception occurs (e.g., non-decimal input), inform the user
				System.out.println("Invalid input.");
				break;
			}
		}
		// Close the Scanner to prevent resource leaks
		scanner.close();
	}
}

