import java.util.Scanner; 
public class RestaurantMenu { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("=== RESTAURANT MENU ==="); 
        System.out.println("1. Pizza "); 
        System.out.println("2. Burger"); 
        System.out.println("3. Pasta "); 
        System.out.println("4. Salad "); 
        System.out.print("Enter your choice (1-4): "); 
        
        int choice = input.nextInt(); 
        
        
        switch (choice) {
            
            case 1: System.out.println("You ordered Pizza - $12.99"); 
            break;
            case 2: System.out.println("You ordered Burger - $8.99"); 
            break; 
            case 3: System.out.println("You ordered Pasta - $10.99"); 
            break; 
            case 4: System.out.println("You ordered Salad - $6.99"); 
            break; 
            default: 
            System.out.println("Invalid choice! Please try again."); 
            
        } 
        input.close(); 
        
    } 
    
}