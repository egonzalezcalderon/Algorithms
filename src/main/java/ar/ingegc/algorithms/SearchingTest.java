package ar.ingegc.algorithms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import ar.ingegc.algorithms.search.BinarySearch;
import ar.ingegc.algorithms.sort.QuickSort;

/**
 * Hello world!
 *
 */
public class SearchingTest {
	
    public static void main( String[] args ) {
    	Integer[] arrayToSort = generateRandomArray(10000, 100000);
    	Integer randomNumberToSearch = arrayToSort[generateRandomNumber(10000)];
    	
        System.out.println("Array = "+toString((new QuickSort()).sort(arrayToSort)));
        System.out.println("Number to Search = "+randomNumberToSearch);
        System.out.println("Start Searching = "+(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")).format(new Date()));
        System.out.println("Number to Search Position = "+(new BinarySearch()).search(arrayToSort, randomNumberToSearch));
        System.out.println("Stop Searching = "+(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")).format(new Date()));
    }
    
    public static Integer[] generateRandomArray(int arraySize, int maxNumber){
		Integer[] array = new Integer[arraySize];
		Random random = new Random();
		
		for (int i = 0; i < arraySize; i++) {
			array[i] = random.nextInt(maxNumber);
		}
		return array;
    }  
    
    public static int generateRandomNumber(int maxNumber) {
		Random random = new Random();
		
		return random.nextInt(maxNumber);
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
