package leetcode;
/*
 * ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
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
