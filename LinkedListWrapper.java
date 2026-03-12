//Macy Culbertson
//SD class assignment started 3/10/26 finished 3/12/26
// Linked List Wrapper contains user input and Student object data

import java.util.Scanner;

public class LinkedListWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program uses a student object that is stored in a linked list.");
        System.out.println("This is to help explain a linked list.");
        System.out.println("This program will create 5 student objects and add them to the linked list.");

       
        LinkedListTest studentList = new LinkedListTest();
        
        studentList.addNode(new StudentObject("Fred", "sixteen", "tenth"));
        studentList.addNode(new StudentObject("Jane", "twelve", "sixth"));
        studentList.addNode(new StudentObject("Kate", "fourteen", "eighth"));
        studentList.addNode(new StudentObject("Tre", "seventeen", "twelveth"));
        studentList.addNode(new StudentObject("Clyde", "fifteen", "ninth"));

        System.out.print("\nDo you want to output the data? (yes/no): ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("yes")) {
            System.out.println("\n--- Forward List (Press Enter to see next) ---");
            StudentObject student = (StudentObject) studentList.getHead();
            
            if (student != null) {
                System.out.println(student);
                while (studentList.hasNext()) {
                    scanner.nextLine(); 
                    student = (StudentObject) studentList.getNext();
                    System.out.println(student);
                }
            }

            System.out.println("\nEnd of list. Press Enter to start backward list...");
            scanner.nextLine();

           
            System.out.println("--- Head to Tail (Press Enter for next) ---");
            student = (StudentObject) studentList.getHead();
            
            
            if (student != null) {
                System.out.println(student);
                while (studentList.hasNext()) {
                    student = (StudentObject) studentList.getNext();
                    System.out.println(student);
                }
            }

       
            System.out.println("n/---Tail to Head ---");
            student = (StudentObject) studentList.getTail();
            
            if (student != null) {
                System.out.println(student);
                while (studentList.hasPrevious()) {
                    student = (StudentObject) studentList.getPrevious();
                    System.out.println(student);
                }
            }

        } else {
            System.out.println("Output skipped.");
        }

        System.out.println("\nProgram finished.");
        scanner.close();
    }
}