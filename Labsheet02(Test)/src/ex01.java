
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("Length = " + nums.length);
		System.out.println("The First element = " + nums[0]);
		System.out.println("The Last element = "+nums[nums.length-1]);
		System.out.println("The Middle element = " + nums[nums.length/2]);
		
		System.out.print("\nDisplay all elements:");
		
		System.out.print(nums[0]);
		for (int i=1; i < nums.length;i++) {
			System.out.print(","+nums[i]);
		}
	}

}
