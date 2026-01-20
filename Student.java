import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;
import java.util.InputMismatchException;
// Macy Culbertson
// SD Class 2
// 2026
// File writing program week two

public class Student {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
        String userfirstname = "";
        String userlastname = "";
        String usergrade = "";
        String userschool = "";
    
    try {
      File myObj = new File("Student.txt"); 
      if (myObj.createNewFile()) {           
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); 
    }
     try {
      FileWriter myWriter = new FileWriter("Student.txt");
        System.out.println("Enter your first name:");
           userfirstname = userInput.nextLine();
                myWriter.write(" User first name is " + userfirstname);
                    myWriter.write(System.getProperty("line.separator"));

        System.out.println("Enter your last name:");
            userlastname = userInput.nextLine();
                 myWriter.write("User last name is " + userlastname);
                    myWriter.write(System.getProperty("line.separator"));
       
        System.out.println("Enter your grade:");
            usergrade = userInput.nextLine();
                myWriter.write(" User grade is " + usergrade);
                    myWriter.write(System.getProperty("line.separator"));

        System.out.println("Enter your school");
            userschool = userInput.nextLine();
                myWriter.write(" User school name is " + userschool);
                    myWriter.write(System.getProperty("line.separator"));
                        myWriter.close();  

      System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                    e.printStackTrace();
            }
        }
    } 


