import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;

        while (!exit) {
            // Display menu options
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Option One");
            System.out.println("2. Option Two");
            System.out.println("3. Option Three");
            System.out.println("4. Option Four");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-4): ");

            // Input validation
            try {
                choice = scanner.nextInt();

                // Process user choice using switch
                switch (choice) {
                    case 1:
                        System.out.println("You selected Option One");
                        // Add your code for Option One here
                        break;
                        
                    case 2:
                        System.out.println("You selected Option Two");
                        // Add your code for Option Two here
                        break;
                        
                    case 3:
                        System.out.println("You selected Option Three");
                        // Add your code for Option Three here
                        break;
                        
                    case 4:
                        System.out.println("You selected Option Four");
                        // Add your code for Option Four here
                        break;
                        
                    case 0:
                        System.out.println("Exiting program... Goodbye!");
                        exit = true;
                        break;
                        
                    default:
                        System.out.println("Invalid choice! Please enter a number between 0 and 4.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid number!");
                scanner.nextLine(); // Clear the scanner buffer
            }
        }
        
        scanner.close();
    }
}