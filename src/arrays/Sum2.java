package arrays;

import java.util.Arrays;

public class Sum2 {

	public static int Sum(int arr[]) {
		int Addition=0;
		for(int i=0;i<arr.length;i++)
		{
			Addition+=arr[i];
		}
		
		System.out.println("Sum of Given array Element is ="+Addition);
		return 0;
		
		
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		
		Sum(arr);
		int isum = Arrays.stream(arr).sum();
		System.out.println("Sum of Given array Element using strem array is="+isum);

	}

}
