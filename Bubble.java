
//Macy Culbertson

//for CTE software development 1

//instructor Mr Gross

import java.util.Arrays;

class bubble{


  public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

            int temp;

temp=arrayToSwap[lowerIndex];

    arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

        arrayToSwap[lowerIndex+1]=temp;

            return arrayToSwap;

}

public static void main(String[] args){

int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
    
    System.out.println("Original array;" + Arrays.toString(arrayToSort));
        
boolean swapNeeded = true;
            if (swapNeeded){
                swapNeeded = false;
                arrayToSort=swapTwoArrayElements(arrayToSort, 2);
                int n = arrayToSort.length;
                for (int i = 0; i < n -1; i++) { //outer loop
                    for (int j = 0; j < n - i - 1; j++) { //inner loop
                    if (arrayToSort[j] > arrayToSort[j + 1]) {
                        swapTwoArrayElements(arrayToSort, j);
                        swapNeeded = true;
                     }
                 }
            }
            System.out.println("Sorted array;" + Arrays.toString(arrayToSort));
            
                }
            }
        }
    


