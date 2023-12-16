package arrays;
import java.util.Arrays;

public class Sum {

	public static void add(int arr[]) {
		int Addition=0;
		for(int i=0;i<arr.length;i++)
		{
			Addition+=arr[i];
		}
		
		System.out.println("Sum of Given array Element is ="+Addition);
		
		
		
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		
		add(arr);
		int isum = Arrays.stream(arr).sum();
		System.out.println("Sum of Given array Element using Arrays.Stream is="+isum);

	}

}
