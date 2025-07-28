// 1. Import the Scanner class
import java.util.Scanner;

public class GreetingBot {
    public static void main(String[] args) {
        // 2. Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}