//Macy Culbertson
//Final Project-- This file the main program functions inlcuding scanner 
// Started 4/27/26
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class Gradebookmanager {
    static ArrayList<Studentschool> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static String fileName = "Studentsdata.txt";

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n--- Gradebook Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grades/Attendance");
            System.out.println("3. Write a report");
            System.out.println("4. Search for student by last name");
            System.out.println("5. View all students");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); 

                if (choice == 1) addStudentschool();
                else if (choice == 2) inputGradesAttendance();
                else if (choice == 3) writeReport();
                else if (choice == 4) searchStudent();
                else if (choice == 5) viewAllStudents();
                else if (choice == 6) System.out.println("Exiting...");
                else System.out.println("Invalid option.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter a number.");
                scanner.nextLine();
                choice = 0;
            }
        }
    }

    public static void addStudentschool() {
        System.out.print("Enter first name: ");
        String f = scanner.nextLine();
        System.out.print("Enter last name: ");
        String l = scanner.nextLine();
        
        studentList.add(new Studentschool(f, l));

        // Basic writer: adds the new student to the end of the file
        try (FileWriter myWriter = new FileWriter(fileName, true)) {
            myWriter.write("Added Student: " + f + " " + l + "\n");
            System.out.println("Student saved to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void inputGradesAttendance() {
        System.out.print("Enter student last name: ");
        String lastName = scanner.nextLine();
        boolean found = false;

        for (Studentschool s : studentList) {
            if (s.lastName.equalsIgnoreCase(lastName)) {
                try {
                    System.out.print("Enter grade: ");
                    s.grade = scanner.nextDouble();
                    System.out.print("Enter attendance: ");
                    s.attendance = scanner.nextInt();
                    scanner.nextLine(); 

                    // Basic writer: adds the update to the end of the file
                    try (FileWriter myWriter = new FileWriter(fileName, true)) {
                        myWriter.write(s.lastName + " Update - Grade: " + s.grade + ", Att: " + s.attendance + "\n");
                    }
                    
                    System.out.println("Data updated and saved to file.");
                    found = true;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number.");
                    scanner.nextLine();
                    return;
                }
            }
        }
        if (!found) System.out.println("Student not found in this session.");
    }

    public static void writeReport() {
        System.out.print("Enter student last name: ");
        String lastName = scanner.nextLine();
        for (Studentschool s : studentList) {
            if (s.lastName.equalsIgnoreCase(lastName)) {
                System.out.print("Enter report comments: ");
                s.report = scanner.nextLine();
                
                // Basic writer: adds the report to the end of the file
                try (FileWriter myWriter = new FileWriter(fileName, true)) {
                    myWriter.write("Report for " + s.lastName + ": " + s.report + "\n");
                }
                
                System.out.println("Report saved to file.");
                return;
            }
        }
        System.out.println("Student not found in this session.");
    }

    public static void searchStudent() {
        System.out.print("Search by last name: ");
        String search = scanner.nextLine().trim().toLowerCase();
        for (Studentschool s : studentList) {
            if (s.lastName.toLowerCase().startsWith(search)) {
                System.out.println("Found: " + s.firstName + " " + s.lastName + " | Grade: " + s.grade);
            }
        }
    }

    public static void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("List is empty for this session.");
        } else {
            for (Studentschool s : studentList) {
                System.out.println(s.firstName + " " + s.lastName + " - Grade: " + s.grade);
            }
        }
    }
}
