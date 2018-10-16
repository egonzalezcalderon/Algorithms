package ar.ingegc.algorithms.sort;

public interface SortAlgorithm {

	public Double[] sort(Double[] array);
	
	public Integer[] sort(Integer[] array);
	
	public String[] sort(String[] array);
	
	public Double[] partialSort(Double[] array, int partition);
	
	public Integer[] partialSort(Integer[] array, int partition);
	
	public String[] partialSort(String[] array, int partition);
		
}
