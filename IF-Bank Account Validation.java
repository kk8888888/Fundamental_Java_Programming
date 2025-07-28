import java.util.Scanner; 
public class BankAccount { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter account balance: $"); 
        double balance = input.nextDouble(); 
        System.out.print("Enter withdrawal amount: $"); 
        double withdrawal = input.nextDouble(); 
        if (withdrawal > 0) { 
            if (balance >= withdrawal) { 
                if (withdrawal <= 1000) { 
                    balance -= withdrawal; 
                    System.out.println("Withdrawal successful!"); 
                    System.out.println("New balance: $" + balance); 
                    
                } 
                else 
                { 
                    System.out.println("Daily limit exceeded! Max: $1000"); 
                    
                } 
                
            } 
            else { 
                System.out.println("Insufficient funds!"); 
                
            } 
            
        } 
        else { 
            System.out.println("Invalid amount! Must be positive."); 
            
        } 
        input.close(); 
        
    } 
    
}