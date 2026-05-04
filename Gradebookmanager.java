//Macy Culbertson
//Final Project-- This main file includes scanner
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
                
                if (choice != 6) {
                    System.out.println("\nPress Enter to return to menu...");
                    scanner.nextLine();
                }
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


    try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)))) {
        out.println("Added Student: " + f + " " + l);
        out.flush();
        
        
        File file = new File(fileName);
        System.out.println("Successfully saved to: " + file.getAbsolutePath());
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

                    try (FileWriter myWriter = new FileWriter(fileName, true)) {
                        myWriter.write(s.lastName + " Grade: " + s.grade + ", Att: " + s.attendance + "\n");
                        myWriter.write("------------------------");
                    } catch (IOException e) {
                        System.out.println("File error.");
                    }
                    
                    System.out.println("Data updated!");
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
                System.out.print("Enter report: ");
                s.report = scanner.nextLine();

                
                try (FileWriter myWriter = new FileWriter(fileName, true)) {
                    myWriter.write("Report for " + s.lastName + ": " + s.report + "\n");
                } catch (IOException e) {
                    System.out.println("File error.");
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void searchStudent() {
        System.out.print("Search: ");
        String search = scanner.nextLine();
        for (Studentschool s : studentList) {
            if (s.lastName.equalsIgnoreCase(search)) {
                System.out.println("Found: " + s.firstName + " " + s.lastName + " | Grade: " + s.grade);
            }
        }
    }

    public static void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in this session.");
        } else {
            for (Studentschool s : studentList) {
                System.out.println(s.firstName + " " + s.lastName + " - Grade: " + s.grade);
            }
        }
    }
}



