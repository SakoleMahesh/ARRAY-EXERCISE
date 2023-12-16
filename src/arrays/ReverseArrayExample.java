package arrays;

public class ReverseArrayExample{
    public static void main(String[]args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original Array:");
        printArray(array);

        reverseArray(array);

        System.out.println("\n"+"Reversed Array:");
        printArray(array);
    }

    public static void reverseArray(int[]array) {
        int len=array.length;

        for (int i=0;i<len/2;i++) {
            int temp = array[i];
            array[i] = array[len-i-1];
            array[len-i-1] =temp;
        }
    }

    public static void printArray(int[]array) {
        for (int element:array) {
            System.out.print(element+" ");
        }
    }
}
