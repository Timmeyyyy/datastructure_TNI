
public class NumberArrayController {
	
	private int[] nums;
	
	public void setNums(int[] nums) {
		this.nums =nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void display() {
		System.out.print("\nDisplay all elements:");
		
		System.out.print(nums[0]);
		for (int i=1; i < nums.length;i++) {
			System.out.print(","+nums[i]);
		}
	}
}
