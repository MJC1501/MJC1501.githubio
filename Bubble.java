
//Macy Culbertson

//for CTE software development 1

//instructor Mr Gross
// Updated program and added debugging output comments

import java.util.Arrays;

class Bubble {
   
    public static void swapTwoArrayElements(int[] arrayToSwap, int lowerIndex) {
        int temp = arrayToSwap[lowerIndex];
        arrayToSwap[lowerIndex] = arrayToSwap[lowerIndex + 1];
        arrayToSwap[lowerIndex + 1] = temp;
    }
// beginning of running program
    public static void main(String[] args) {
        //debug at 1 is no output. debug at 3 is detailed output
        int debug = 2; //basic output
        int[] arrayToSort = {1, 3, 4, 5, 1, 23, 57, 126, 4, 543, 345, 23, 12, 45, 67, 97};

        if (debug > 0) { 
            System.out.println("Starting the important loop");// This output is important because it is tells the user when the program starts
            if (debug == 3) {
                System.out.println("The input in the important loop: randomly ordered numbers.");//This output is important becuase it gives more information about what the next part of the program is going to do.
            }
        }

        System.out.println("Original array: " + Arrays.toString(arrayToSort));

        if (debug > 0) {
            System.out.println("Finished output of original array list."); // This is important because it tells user that the first section fo the program has ended.
            if (debug >= 2) {
                System.out.println("Entering the bubble sorting section.");// This is a more detailed output that is super important becuase it lets the user know what the program is going to do next.
            }
        }

        
        int n = arrayToSort.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; 
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    swapTwoArrayElements(arrayToSort, j);
                    swapped = true;
                }
            }
            
            if (!swapped) break;
        }

        System.out.println("Sorted array: " + Arrays.toString(arrayToSort));
        System.out.println("End of program. Sorted numbers outputed.");// Important output because it lets the user know that the program has ended.
    }
}
