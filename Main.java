// Macy 
//Program to print even and odd numbers 1-100
// For SD class
public class Main {
  public static boolean isEvenNumber(int userInput){
    if(userInput%2 == 0){ //Calculates if the number is even to then print input 
      System.out.println("Input is an even number");
      return true;
    }else {
        System.out.println("Input is an odd number");
        return false;
    }
  }  
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i++) {
      System.out.print(i+" ");
      isEvenNumber(i);
    }
int sum = 0;
  for (int i = 1; i <= 100; i++) {
      sum = sum + i;
}
        System.out.println("Sum is " + sum);
  

  // array groups numbers together and organizes them. 
// For SD class modified old program
// Date 9/17/25
       class EvenOddArraySum {

    public static void main(String[] args) {
        
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        
        long totalSum = 0; 
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0) {
                System.out.println(currentNumber + " is Even");
            } else {
                System.out.println(currentNumber + " is Odd");
            }
            totalSum += currentNumber;
        }

        
        System.out.println("The total sum of all numbers in the array is: " + totalSum);
    }

    @Override
    public String toString() {
      return "EvenOddArraySum []";
    }
}
      
        }
      }


