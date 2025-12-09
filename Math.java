// Macy Culbertson
// For SD class 2025
// exceptions
public class Math {
   public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30, 40};
            System.out.println(numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You tried to access an array element that doesn't exist.");
            System.out.println("The valid indices for this array are 0 to " + (e.getStackTrace()[0].getLineNumber() - 1) + "."); 

        System.out.println("Continue to more mathematical operations");

        
        try {
            int numerator = 150;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Error: You attempted to divide a number by zero.");
            System.out.println("Division by zero is mathematically undefined.");
        }

        System.out.println("Program has caught both errors and ended without stopping or crashing.");
    }
}}
