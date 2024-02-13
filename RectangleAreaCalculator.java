// Imports: The program imports the Scanner class from the java.util package, which is used to read input from the user.

import java.util.Scanner;

// Class Definition: The RectangleAreaCalculator class is defined as a public class. This is the main class of the program.
// Main Method: The main method is the entry point of the program. 
// It creates a new Scanner object to read input from the user and initializes a boolean variable exit to false.

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

// While Loop: The program enters a while loop that continues until the user chooses to exit (exit becomes true).
// Menu: Inside the loop, a menu is displayed to the user using System.out.println. 
// The user is prompted to choose an option: either calculate the area or exit the program.

        while (!exit) {
            System.out.println("1. Calculate Area");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();



// Switch Statement: The user's choice is read using scanner.nextInt() and processed using a switch statement. If the user chooses option 1, the calculateArea method is called. If the user chooses option 2, the exit flag is set to true, and a farewell message is displayed. 
//If the user selects any other option, an error message is displayed, and the loop continues.            
            
            
            switch (choice) {
                case 1:
                    calculateArea(scanner);
                    break;
                case 2:
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

// Close Scanner: After the loop ends, the Scanner object is closed to release system resources.
    
        
        scanner.close();
    }

    
// calculateArea Method: This method takes a Scanner object as a parameter. 
// It prompts the user to enter the length and width of the rectangle using System.out.print and scanner.nextDouble(). 
// It then calculates the area of the rectangle using the formula length * width and displays the result using System.out.println.
   
    
    
    public static void calculateArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
