import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
// Macy Culbertson
// Program where user imputs data and where the dogs each user has is averaged
// SD class 2026
public class Userinput {
    public static void main(String[] args) {

        String delimiter = "|";
        int numberOfRecords = 5;
        String fileName = "FrequencyPartTwo.txt";

        try (Scanner userInput = new Scanner(System.in);
             PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {

            System.out.println("Enter information for " + numberOfRecords + " users.");

            int totalDogs = 0;
            

            for (int i = 1; i <= numberOfRecords; i++) {

                System.out.println("\n--- Entry " + i + " ---");

                System.out.println("Enter your full name:");
                String userfullname = userInput.nextLine();

                int usernumberofdogs = 0;
                System.out.println("Enter your number of dogs:");
                while (true) {
                    try {
                        usernumberofdogs = userInput.nextInt();
                        userInput.nextLine();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        userInput.nextLine();
                    }
                }

                totalDogs += usernumberofdogs;

                System.out.println("Enter what city you live in:");
                String usercity = userInput.nextLine();

                System.out.println("Enter your state:");
                String userstate = userInput.nextLine();

                System.out.println("Enter your favorite color:");
                String userfavoritecolor = userInput.nextLine();

                pw.println(userfullname + delimiter + usernumberofdogs + delimiter + usercity + delimiter + userstate + delimiter + userfavoritecolor);
                pw.println (totalDogs + delimiter);
            }

            double averageDogs = (double) totalDogs / numberOfRecords;

            System.out.println("\nSuccessfully wrote user records to " + fileName);
            System.out.println("Total number of dogs: " + totalDogs);
            System.out.println("Average number of dogs per person: " + averageDogs);

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}