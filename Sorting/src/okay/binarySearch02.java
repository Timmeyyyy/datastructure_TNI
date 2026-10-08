package okay;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class binarySearch02 {
	public static LinkedList<Integer> random_initial() {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		Random rnd = new Random();
		while (nums.size() < 10) {
			nums.add(rnd.nextInt(99)); // random number between 0 and 99
		}
		return nums;
	}
	
	public static int binarySearch(int[] nums, int target) {
		
		
		int low = 0;
		int high = nums.length -1;
		while (low <= high){
			int middle = (low + high) /2;
			if(target == nums[middle]) {
				return nums[middle];
			}
			else if(target < nums[middle]) {
				high = middle-1;
			}
			else {
				low = middle+1;
			}
			
		}
	
		return -1;
	}
	
	public static void main(String[] arg) {
		LinkedList<Integer> nums = random_initial();
		Scanner sc = new Scanner(System.in);
		nums.sort( (a,b) -> {return a.compareTo(b);} );
		for (int num : nums) {
			System.out.print(num + " ");
		}
		int[] array = new int[nums.size()];

		for (int j = 0; j < nums.size(); j++) {
			array[j] = nums.get(j);
		}
		System.out.print("\nEnter target: ");
		int target = sc.nextInt();
		
		int index = binarySearch(array, target);
		if (index != -1) {

			System.out.println("The target (" + target + ") at index " + index);

		} else {

			System.err.println("Cannot found " + target + " in this linked list");

		}
	}
	
	
	// Timey <3
}
