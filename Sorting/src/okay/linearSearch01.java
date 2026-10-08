package okay;

import java.util.Scanner;

public class linearSearch01 {
 
	public static void main(String[] args) {
		int [] nums = {96, 87, 18, 6, 31, 11, 56, 36, 76 };
		
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nInput a target number: ");
		int target = input.nextInt();
		
		int index = linearSearch(nums, target);
		
		if(index != -1) {
			System.out.println("The target " + target + " at index " + index);
		} else {
			System.err.println("Cannot found " + target + " in this array");
		}
	}
 
	public static int linearSearch(int[] nums,int target) {
		for(int j = 1;j < nums.length;j++) {
			if (target == nums[j]) return j;
		}
		return -1;
	}
}
 