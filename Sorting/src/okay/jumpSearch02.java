package okay;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class jumpSearch02 {
	public static LinkedList<Integer> random_initial() {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		Random rnd = new Random();
		while (nums.size() < 10) {
			nums.add(rnd.nextInt(99)); // random number between 0 and 99
		}
		return nums;
	}
	
	public static int jumpsearch(int[] nums, int target) {
		int n = nums.length;
		int jump = (int) Math.sqrt(n);
		int start = 0,m = 0;
		while (m<n) {
			if (target == nums[m]) {
				return m;
			}
			else if (target > nums[m]) {
				start = m;
				m +=jump;
			}else {
				for(int j = start;j < m;j++) {
					if (target == nums[j]) return j;
				}
				return -1;
			}
		}
		for(int j = start;n < m;j++) {
			if (target == nums[j]) return j;
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
		
		int index = jumpsearch(array, target);
		if (index != -1) {

			System.out.println("The target (" + target + ") at index " + index);

		} else {

			System.err.println("Cannot found " + target + " in this linked list");

		}
	}
	
	
	// Timey <3
}
