import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int positions = 3;
        System.out.print(Arrays.toString(rotateArray(array,positions)));
    }

    public static int[] rotateArray(int[] arr, int positions) {
        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i + positions  > arr.length-1) {
                rotatedArr[i + positions - arr.length] = arr[i];
            } else {
                rotatedArr[positions + i] = arr[i];
            }
        }
        return rotatedArr;
    }
}