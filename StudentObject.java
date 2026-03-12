//Macy Culbertson
// SD class 3/10/26
// Student Object class defines the object data as strings
import java.util.Scanner;

public class StudentObject {
    private String name;
    private String age;
    private String studentGrade;

    // constructor for the student object class. Takes in a name, address and
    
    StudentObject(String name, String age, String studentGrade) {
        this.name = name;
        this.age = age;
        this.studentGrade = studentGrade;
    }
    // toString method for the student object class. This is used to print out the
    // student object in a readable format. You will need to use this method in your
    // linked list implementation to print out the student objects stored in the
    // nodes of the linked list.

    public String toString() {
        return name + " is " + age + " student grade " + studentGrade;
    }

    // getter and setter methods for the student object class. These are used to set
    // and get the name, address and student ID fields of the student object. You
    // will need to use these methods in your linked list implementation to
    // manipulate the student objects stored in the nodes of the linked list.
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGrade() {
        return studentGrade;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void changeAge(String newAge) {
        age = newAge;
    }

    // This method is used to change the student ID of the student object. Since
    // student ID's should not be changed, this method will ask the user if they are
    // sure they want to change the student ID before changing it. You will need to
    // use this method in your linked list implementation to manipulate the student
    // objects stored in the nodes of the linked list.
    public void changeID(String newGrade) {
        System.out.println("Student's grade should not be changed are you sure this needs changed");
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);
        String test = inp.nextLine();
        if (test.equals("y") || test.equals("Y")) {// if the user confirms that they want to change the student ID, then
                                                   // change it confirmation can be lower or uppercase y

            studentGrade = newGrade;
        }
    }
}

