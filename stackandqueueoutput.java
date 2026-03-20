//Macy Culbertson
//SD class 
// Stack and queue assignment
// file controls the program start and the user input
import java.util.Scanner;

public class stackandqueueoutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        myStack stack = new myStack();
        Myqueue queue = new Myqueue();

        System.out.print("How many athletes? ");
        try {
            int count = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < count; i++) {
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Sport: ");
                String sport = scanner.nextLine();
                System.out.print("Enter spot in line:");
                String spotinline = scanner.nextLine();

                Player p = new Player(name, sport, spotinline);
                stack.push(p);
                queue.enqueue(p);
            }
            
            System.out.println("\n--- Stack Output ---");
            stack.display();
            
            System.out.println("\n--- Queue Output ---");
            queue.display();
            

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}