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

  }
}
  
