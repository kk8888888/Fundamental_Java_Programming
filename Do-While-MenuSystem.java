import java.util.Scanner; 
public class MenuSystem { 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        int choice; do { 
            
            System.out.println("\n=== CALCULATOR MENU ==="); 
            System.out.println("1. Addition"); 
            System.out.println("2. Subtraction"); 
            System.out.println("3. Multiplication"); 
            System.out.println("4. Division"); 
            System.out.println("5. Exit");
            System.out.print("Choose option (1-5): "); 
            
            choice = input.nextInt(); 
            
            
            switch (choice) { 
                case 1: System.out.println("Addition selected"); 
                break; 
                case 2: System.out.println("Subtraction selected"); 
                break; 
                case 3: System.out.println("Multiplication selected"); 
                break; 
                case 4: System.out.println("Division selected"); 
                break; 
                case 5: System.out.println("Goodbye!"); 
                break; 
                default: System.out.println("Invalid choice!"); 
                
            } 
            
        } while (choice != 5); 
        input.close(); 
        
    } 
    
}