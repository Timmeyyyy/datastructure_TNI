package ok;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sorting {

	private int[] array;

	public Sorting(int[] array) {
		this.array = array;
	}

	public void printSortedData() {
		for (int arr : array) {
			System.out.print(arr + " ");
		}
	}

	public void bubblesort() {
		for (int k = 0; k < array.length - k; k++) {
			boolean is_swapped = false;
			for (int h = 0; h < array.length - k - 1; h++) {
				if (array[h] < array[h + 1]) {
					int temp = array[h];
					array[h] = array[h + 1];
					array[h + 1] = temp;
					is_swapped = true;
				}
			}
		}
	}

	public void selectionSort() {

		for (int k = 0; k < array.length - 1; k++) {
			int minimun_index = k;
			for (int h = k+1; h < array.length; h++) {
				if (array[minimun_index] > array[h]) {
					minimun_index = h;
				}
			}
			int temp = array[k];
			array[k] = array[minimun_index];
			array[minimun_index] = temp;

		}
	}

	public void insertionsort() {
		for (int k = 1; k < array.length; k++) {
			int key = array[k];
			int walker_index = k-1;
			while (walker_index >= 0 && array[walker_index] > key) {
				int temp = array[walker_index];
				array[walker_index] = array[walker_index + 1];
				array[walker_index + 1] = temp;
				walker_index--;
			}
			array[walker_index + 1] = key;
		}
	}

	public void quickSort() {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(array.length-1);
		stack.push(0);
		while(!stack.isEmpty()) {
			int low = stack.pop();
			int high = stack.pop();
			if (high - low < 1) {
				continue;
			}
			int j = partition(low, high);
			stack.push(high);
			stack.push(j+1);
			stack.push(j);
			stack.push(low);
	}
}
	
	public int partition(int low, int high) {
		
		int pivot = array[low];
 
		int i = low, j = high;
 
		while (true) {
 
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i >= j) {
				break;
			}
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return j;
	}
}
