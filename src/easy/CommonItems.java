package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonItems {

	public static void main(String[] args) {
		   // NOTE: The following input values are used for testing your solution.

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        
       printSolution(commonElements(array1A, array2A));
        
       
        
        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        
        printSolution(commonElements(array1B, array2B));
//        
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).

        
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        printSolution(commonElements(array1C, array2C));
        // common_elements(array1C, array2C) should return [] (an empty array).

	}
	
	
	// Implement your solution below.
    // NOTE: Remember to return an Integer array, not an int array.
    public static Integer[] commonElements(int[] array1, int[] array2) {
        Set<Integer> commons = new HashSet<Integer>();
        for(int firstArrayItem : array1 ) {
        	for(int secondArrayItem : array2) {
        		if(firstArrayItem == secondArrayItem) {
        			commons.add(firstArrayItem);
        		}
        	}
        }
        Integer[] resultInArray = new Integer[commons.size()];
        Iterator<Integer> iterator = commons.iterator();
        int index=0; 
        while(iterator.hasNext()) {
        	resultInArray[index++] = iterator.next();
        }
        
        return resultInArray;
    }
    
    public static void printSolution(Integer[] solution) {
    	 for(Integer item : solution) {
         	System.out.println(item);
         }
    	 System.out.println(">>>>>>>>>>>>>");
    }

}
