import java.util.Scanner;

/**
 * Write a description of class medicine_store here.
 *
 * @author ASHIMESH MAGAR
 * @version 1.00
 */
public class medicine_store
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("The medicine name is:");
        
        String medicinename= sc.nextLine();
        System.out.println(medicinename);
        
        System.out.println("What is the price of medicine per pic?");
        double price= sc.nextDouble();
        System.out.println("The price of medicine is"+""+price+"per pic");
        
        System.out.println("The number of medicine available at store:");
        int stock=sc.nextInt();
        System.out.println(stock);
        
        if(stock>12)
        System.out.println("The stock level exceeds.");
        else
    
        {
            System.out.println("The medicine is available at store:"+ medicinename);
            sc.nextLine();
            String prescription= sc.nextLine();
            System.out.println(prescription);
            
        }
        
        
        
    }
}