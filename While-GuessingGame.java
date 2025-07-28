import java.util.Scanner; 
import java.util.Random; 

public class GuessingGame { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        Random random = new Random(); 
        int targetNumber = random.nextInt(100) + 1; 
        int guess = 0; int attempts = 0; 
        
        System.out.println("Guess the number (1-100)!"); 
       
       
        while (guess != targetNumber) { 
            System.out.print("Enter your guess: "); 
            guess = input.nextInt(); attempts++; 
            if (guess < targetNumber) { 
                System.out.println("Too low! Try again."); 
                
            } else 
            if (guess > targetNumber) { 
                System.out.println("Too high! Try again."); 
                
            } else { 
                System.out.println("Congratulations! You got it!"); 
                System.out.println("It took you " + attempts + " attempts."); 
                
            } 
            
        } 
        input.close();
        } 
    
}