import java.util.Scanner;
import java.util.InputMismatchException;
public class Program {

    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    boolean validInput = false;

     while (!validInput) {
       try {
       System.out.println("Enter your name:");
            String username = userInput.nextLine();
            System.out.println("Thank you for inputing the line, I read username");
                
       
      System.out.println("Enter your age:");
            int userAge = userInput.nextInt();
            System.out.println("Thank you for inputing the int, I read userage");
                
        
    System.out.println("Enter a floating-point numner:");
            float usernumber = userInput.nextFloat();
            System.out.println("Thank you for inputing the float, I read usernumber");
                validInput = true; 

            } catch (InputMismatchException e) {
           
            System.out.println("Invalid input. Please enter a valid float number.");
            
            userInput.next();
            
            userInput.close();
        }
     }
        
        try {
        System.out.println("Hello, Ms. Culbertson or can I call you Macy");
        } finally {
            System.out.println("End of program");
        }
     }
}



   



