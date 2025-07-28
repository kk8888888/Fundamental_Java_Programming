import java.util.Scanner;

public class AskAge {
    public static void main(String[] args) {
        // 2. Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age < 13) {
        System.out.println("You are a child.");
        System.out.println("  (^_^)  ");
         } 
         else 
         if (age < 20) {
         System.out.println("You are a teenager.");
         System.out.println("  \\_('-')_/");
         } 
         else {
         System.out.println("You are an adult.");
         System.out.println("  ( ._.)   ");
         }
       }
}