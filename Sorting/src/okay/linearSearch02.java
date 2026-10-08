package okay;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class linearSearch02 {

	public static LinkedList<Integer> random_initial() {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		Random rnd = new Random();
		while (nums.size() < 10) {
			nums.add(rnd.nextInt(99)); // random number between 0 and 99
		}
		return nums;
	}

	public static int linearSearch(int[] nums, int target) {
		for (int j = 0; j < nums.length; j++) {
			if (target == nums[j]) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		LinkedList<Integer> nums = random_initial();
		Scanner sc = new Scanner(System.in);

		for (int num : nums) {
			System.out.print(num + " ");
		}

		int[] array = new int[nums.size()];

		for (int j = 0; j < nums.size(); j++) {
			array[j] = nums.get(j);
		}
		System.out.print("\nEnter target: ");
		int target = sc.nextInt();
		
		int index = linearSearch(array, target);
		if (index != -1) {

			System.out.println("The target (" + target + ") at index " + index);

		} else {

			System.err.println("Cannot found " + target + " in this linked list");

		}
	}
	
	
	//Timey <3
}
