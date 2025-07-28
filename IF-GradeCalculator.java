import java.util.Scanner; 
public class GradeCalculator { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter your score (0-100): "); 
        
        int score = input.nextInt(); if (score >= 90) 
        { 
          System.out.println("Grade: A - Excellent!"); 
        } 
        else if (score >= 80) 
        { 
            System.out.println("Grade: B - Good!"); 
        } 
        else if (score >= 70) 
        { 
            System.out.println("Grade: C - Average"); 
        } 
        else if (score >= 60) { 
            System.out.println("Grade: D - Below Average"); 
        } 
        else 
        { 
            System.out.println("Grade: F - Needs Improvement"); 
        } 
        input.close(); 
    } 
}