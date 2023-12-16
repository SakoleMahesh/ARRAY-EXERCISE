package arrays;

public class MaxMinExample {
    public static void main(String[] args) {
        int[] array = {1,2,3,0,0,3,2,1,22,12};
        Max(array);
        Min(array);
    }

    public static void Max(int[] array) {
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }
        System.out.println("Maximum value: " + max);
    }

    public static void Min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; 
            }
        }
        System.out.println("Minimum value: " + min);
    }
}
