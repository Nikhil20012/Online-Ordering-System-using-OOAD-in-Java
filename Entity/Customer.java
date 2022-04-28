package Entity;
import java.util.Scanner;

public class Customer {
    public String custNumber;
    public String custCard;


    public String getCustomerNumber(){
        System.out.println("Enter your Phone Number");
        Scanner input = new Scanner(System.in);
        
        custNumber= input.nextLine();
        return custNumber;
    }
   
    public String getCard(){
        System.out.println("Enter your Card Details");
        Scanner input = new Scanner(System.in);
        
        custCard= input.nextLine();
        return custCard;


    }
}
