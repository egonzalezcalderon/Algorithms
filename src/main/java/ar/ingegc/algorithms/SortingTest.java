package ar.ingegc.algorithms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import ar.ingegc.algorithms.sort.QuickSort;

/**
 * Hello world!
 *
 */
public class SortingTest {
	
    public static void main( String[] args ) {
    	Integer[] arrayToSort = generateRandomArray(10000, 100000);
    	Integer[] arrayToPartialSort = copyArray(arrayToSort);
    	
        System.out.println("Array = "+toString(arrayToSort));
        System.out.println("Start Partial Sorting = "+(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")).format(new Date()));
        System.out.println("Partial Sorted Array = "+toString((new QuickSort()).partialSort(arrayToPartialSort, 2)));
        System.out.println("Stop Partial Sorting = "+(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")).format(new Date()));
        System.out.println("Start Sorting = "+(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")).format(new Date()));
        System.out.println("Sorted Array = "+toString((new QuickSort()).sort(arrayToSort)));
        System.out.println("Stop Sorting = "+(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")).format(new Date()));
        System.out.println("Mismatch Position = "+mismatchPosition(arrayToSort, arrayToPartialSort));
    }
    
    public static Integer[] generateRandomArray(int arraySize, int maxNumber){
		Integer[] array = new Integer[arraySize];
		Random random = new Random();
		
		for (int i = 0; i < arraySize; i++) {
			array[i] = random.nextInt(maxNumber);
		}
		return array;
    }  
    
    public static Integer[] copyArray(Integer[] array){
		Integer[] arrayCopy = new Integer[array.length];
		
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}
		return arrayCopy;
    }    
    
    public static String toString(Integer[] array) {
    	String arrayStr = "[";
    	for (int i=0; i<array.length; i++) {
    		arrayStr += array[i].toString() + ",";
    	}
    	arrayStr += "]";
    	arrayStr = arrayStr.replace(",]", "]");
    	return arrayStr;
    }
    
    public static int mismatchPosition(Integer[] firstArray, Integer[] secondArray) {
    	int misPosition = 0;
    	for (;firstArray[misPosition] == secondArray[misPosition]; misPosition++);
    	return misPosition;
    }
}
