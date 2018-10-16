package ar.ingegc.algorithms.sort;

public class QuickSort implements SortAlgorithm {

	public Double[] sort(Double[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer[] sort(Integer[] array) {
		int low = 0;
		int high = array.length-1;
		
		return quickSort(array, low, high);
	}

	public String[] sort(String[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer[] quickSort(Integer[] array, int low, int high) {
		
	    if (low < high) {
	        int pivot = partition(array, low, high);

	        quickSort(array, low, pivot - 1);  
	        quickSort(array, pivot + 1, high); 
	    }
	    
	    return array;
	}
	
	public Integer[] quickSortPartial(Integer[] array, int low, int high, int partition) {
		
	    if (low < high) {
	    	int pivot = 0;
	    	while (pivot < partition) {
	    		pivot = partition(array, pivot, high);
	    	}
	        
	        quickSort(array, low, pivot - 1);  
	    }
	    
	    return array;
	}	
	
	public int partition(Integer[] array, int low, int high) {
	    int pivot = array[high];  
	 
	    int i = low;  // Index of smaller element

	    for (int j = low; j < high; j++) {
	    	
	        if (array[j] <= pivot) {
	            array = swap(array, i, j);
	            i++;
	        }
	        
	    }
	    array = swap(array, i, high);
	    return i;
	}	
		
	public Integer[] swap(Integer[] array, int i, int j) {
		Integer value = array[i];
		array[i] = array[j];
		array[j] = value;
		return array;
	}

	public Double[] partialSort(Double[] array, int partition) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer[] partialSort(Integer[] array, int partition) {
		int low = 0;
		int high = array.length-1;
		
		return quickSortPartial(array, low, high, partition);
	}

	public String[] partialSort(String[] array, int partition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
