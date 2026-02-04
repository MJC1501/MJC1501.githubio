import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
      
        String testString = "the quick brown fox jumped over the lazy dog";
            System.out.println("--- Test String ---");
        
      
        String[] Testwords = testString.split("\\s+");
        
      
        for (String word : Testwords) {
            System.out.println(word);
        }
        System.out.println("Total Test String Count: " + Testwords.length);

     
        Scanner scanner = new Scanner(System.in);
            System.out.println("\n--- User Input  ---");
                System.out.print("Please enter a sentence: ");
                    String userInput = scanner.nextLine();

        
        String[] userWords = userInput.trim().split("[\\p{Punct}\\s]+");

        for (String word : userWords) {
            if (!word.isEmpty()) { 
                System.out.println(word);
            }
        }
        System.out.println("Total User Word Count: " + userWords.length);
        
        scanner.close();
                        
    }
}
            
        



        
    
