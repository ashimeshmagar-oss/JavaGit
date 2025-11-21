
/**
 * Write a description of class TUTORIAL3 here.
 *
 * @author ASHIMESH MAGAR
 * @version 1.00
 */
public class TUTORIAL3
{
    int qty; // instance variable
    static int rrt; // static variable
    
    public static void main(String[] args)
{
    int age=14; // local variable
    System.out.println(age);
    System.out.println(TUTORIAL3.rrt);
     
    // Implicit typecasting
    
    double dtr=age;
    System.out.println(dtr);
    
    // Explicit typecasting
    
    double db=10.09;
    int ptr= (int)db;
    System.out.println(ptr);
    
    // Exceptions in arthematic
     byte b1= 10;
     byte b2= 12;
     byte sum= (byte)(b1+b2);
     System.out.println(sum);
     
     // Short, Char
     
     
     // Minimum, maximum, size, bytes
     System.out.println(Byte.MAX_VALUE); // maximum value
     System.out.println(Byte.MIN_VALUE); // minimum value
     System.out.println(Byte.SIZE); // bits
     System.out.println(Byte.BYTES); // bytes
     
     // Escape Sequence
     
     System.out.println("Hello\nWorld");
     System.out.println("Hamro\tNepal");
     System.out.println("She said\"Hi\" ");
     
     //Unicode Escpae Sequence
     
     System.out.println("\u2764");
     
     
     
     
     
     
}
}