package arrays;

import java.util.Arrays;

public class UniqueElement {

	public static void main(String[] args) {
		int[] nums = {8,1,2,3,3,4,4,3,3,5,6,7,6,4,5,3};
		System.out.println("given array: " + Arrays.toString(nums));

		int[] unique = findUniqueNumbers(nums);
		System.out.println("unique value: " + Arrays.toString(unique));
		
		Arrays.sort(unique);
		System.out.println("unique value after sort: " + Arrays.toString(unique));
	}

	public static int[] findUniqueNumbers(int[] nums) {
		int n = nums.length;
		int count = 1;
		int[] output = new int[n];
		output[0] = nums[0];
		int flag = 0;

		for (int i = 1; i < n; i++) {
			flag = 0;
			for (int j = 0; j < count; j++) {
				if (output[j] == nums[i]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				output[count] = nums[i];
				count++;
			}
		}
		int[] result = Arrays.copyOf(output, count);
		return result;
	}
}