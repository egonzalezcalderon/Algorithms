package ar.ingegc.algorithms.search;

public class BinarySearch implements SearchAlgorithm {

	public int search(Double[] array, Double value) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int search(Integer[] array, Integer value) {
		int low = 0;
		int high = array.length-1;
		
		return binarySearch(array, low, high, value);
	}

	public int search(String[] array, String value) {
		// TODO Auto-generated method stub
		return 0;
	}
	
    public int binarySearch(Integer array[], int low, int high, Integer value) { 
        if (high >= low) { 
            int mid = low + (high - low)/2; 
  
            if (array[mid] == value) 
               return mid; 
  
            if (array[mid] > value) 
               return binarySearch(array, low, mid-1, value); 
   
            return binarySearch(array, mid+1, high, value); 
        } 
  
        // We reach here when element is not present 
        //  in array 
        return -1; 
    } 

}
