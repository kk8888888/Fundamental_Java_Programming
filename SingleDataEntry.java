// Step-by-step Single Data Entry
import java.util.Scanner; public class SingleDataEntry { 
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = sc.nextInt();
    System.out.println("You entered: " + number);
    }
}