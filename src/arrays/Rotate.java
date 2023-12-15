package arrays;

public class Rotate {
	 public static void rotate(int array[])
		{
		 int length=array.length;
		 int temp;
		
		 System.out.println("Array before rotating");
		for (int i : array)
		 System.out.print(" " + i);
		
		
		for (int i = 0; i < length / 2; i++) {
			temp = array[i];
            for (int j = length - 1; j >i; j--) {
                
                array[i] = array[j];
                array[j] = temp;
                break;
            	}
          
            
			}
		System.out.println("\r"+"Array after rotating");
		for (int j : array)
		 System.out.print(" " + j);
		}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		rotate(arr);
	  
	}

}
