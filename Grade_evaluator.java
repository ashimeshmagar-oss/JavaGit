import java.util.Scanner;

/**
 * Write a description of class Grade_evaluator here.
 *
 * @author Ashimesh 
 * @version 1.00
 */
public class Grade_evaluator
{ 
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = input.nextInt();
        String Results = (marks>40) ? "Pass":"fail";
        System.out.println(Results);
        
        
        
    }
}