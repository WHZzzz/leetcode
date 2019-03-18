package leetcode;
/*
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums=new int[] {2,7,11,15};
		int target=18;
		int[] result=sum(nums, target);
		System.out.println("["+result[0]+","+result[1]+"]");

	}

	public static int[] sum(int[] nums,int target) {
		int[] result=new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]+nums[j]==target) {
					result[0]=i;
					result[1]=j;
					return result;
				}
			}
		}
		throw new IllegalArgumentException("No solution!");
	}
}
