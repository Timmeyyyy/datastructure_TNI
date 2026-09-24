package ok;

public class TestApp {
	 
	public static void main(String[] args) {
		int[] nums = {11, 9, 23, 87, 38, 22, 92, 10};
		
		//Sorting sort1 = new Sorting(nums);
		//sort1.bubbleSort();
		//sort1.printSortedData();
		
		Sorting sort2 = new Sorting(nums);
		sort2.selectionSort();
		sort2.printSortedData();
 
	}
	
	
 
}
