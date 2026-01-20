import java.util.Scanner;
import java.util.InputMismatchException;
//Macy Culbertson
//inport scanner project
//2026 SD Class 2

public class Program {

    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    boolean validInput = false;
   
        String userfirstname = "";
        String userlastname = "";
        int userAge = 0;
        Float usernumber = 0.0f;


     while (!validInput) {
       try {
       System.out.println("Enter your first name:");
           userfirstname = userInput.nextLine();
            System.out.println("Thank you for inputing the line, I read userfirstname");

        System.out.println("Enter your last name");
            userlastname = userInput.nextLine();
            System.out.println("Thank you for inputing the line, I read userlastname");
                
       
      System.out.println("Enter your age:");
           userAge = userInput.nextInt();
            System.out.println("Thank you for inputing the int, I read userage");
                
        
    System.out.println("Enter a floating-point numner:");
             usernumber = userInput.nextFloat();
            System.out.println("Thank you for inputing the float, I read float number");
                validInput = true; 

            } catch (InputMismatchException e) {
           
            System.out.println("Invalid input. Please enter a valid float number.");
            
            userInput.next();
            
            userInput.close();
        }
     }
        
        try {
        System.out.println("Hello, Ms. or Mr. " + userlastname + " or can I call you " + userfirstname);
        } finally {
            System.out.println("End of program");
        }
     }
}



   



