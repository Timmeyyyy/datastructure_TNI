package okay;

import java.util.Scanner;

public class jumpSearch01 {
 
	public static void main(String[] args) {
		int[] nums = {96, 87, 18, 6, 31, 11, 56, 36, 76};
		
		nums = sorting(nums);
		
		for(int num : nums) {
			System.out.print(num + " ");
		}
		Scanner input = new Scanner(System.in);
		System.out.print("\nInput a target number: ");
		int target = input.nextInt();
		
		int index = jumpsearch(nums, target);
		
		if(index != -1) {
			System.out.println("The target " + target + " at index " + index);
		} else {
			System.err.println("Cannot found " + target + " in this array");
		}
	}
	
	
	
	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}
	
	public static int jumpsearch(int[] nums, int target) {
		int n = nums.length;
		int jump = (int) Math.sqrt(n);
		int start = 0,m = 0;
		while (m<n) {
			if (target == nums[m]) {
				return nums[m];
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
 
}