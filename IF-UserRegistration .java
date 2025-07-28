import java.util.Scanner; 

public class UserRegistration { 
        
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter username: "); 
        String username = input.nextLine(); 
    
        System.out.print("Enter age: "); 
        int age = input.nextInt(); 
        
        input.nextLine(); 
        
        
        // Clear buffer 
        System.out.print("Enter email: "); 
        String email = input.nextLine(); 
        
        
        
        // Validation and processing 
        
        if (age >= 18 && email.contains("@")) 
        { 
            System.out.println("Registration successful!");
            System.out.println("Welcome, " + username); 
        } 
        else 
        { 
          System.out.println("Registration failed. Check your details."); 
            
        } 
        input.close();
        } 
    
}