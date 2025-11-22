import java.util.*;

/**
 * Write a description of class Mathoperations here.
 *
 * @author Ashimesh magar
 * @version 1.00
 */
public class Mathoperations
{
    public static void main (String[] args)
    
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first num");//first number as input
        int Firstnum= input.nextInt();
        System.out.println("Enter the next num");//second number as input
        int Nextnum= input.nextInt();
        int Sum, Difference, Product, Qotient;
        
        //Using arthmetic operatiors
        
        Sum= Firstnum + Nextnum;//adding two numbers
        Difference= Firstnum - Nextnum;//subtracting two numbers
        Product= Firstnum*Nextnum;//multiplying two numbers
        Qotient= Firstnum/Nextnum;// dividing two numbers
        
        System.out.println("The sum is:" + Sum);
        System.out.println("The difference is:" + Difference);
        System.out.println("The product is:" + Product);
        System.out.println("The Qotient is:" + Qotient);
        
        //Using unary operators and Assignment operators
        
        int a= ++Firstnum;// pre increment
        int b= Firstnum++;// post increment
        int c= --Nextnum;//pre decrement
        int d= Nextnum--;//posst decrement
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        
        //Using the Relational operators
        
        System.out.println(Firstnum < Nextnum);
        
        System.out.println(Firstnum > Nextnum);
        
        System.out.println(Nextnum >= Firstnum);
        
        System.out.println(Nextnum <= Firstnum);
        
        
        //Using Ternary Operators
        
        System.out.println("Enter the age:");
        int age= input.nextInt();
        String Candrive= (age>16) ? "You can drive": "You cannot drive:";
        System.out.println(Candrive);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}