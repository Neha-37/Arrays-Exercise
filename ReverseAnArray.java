import java.util.Arrays;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr1 = {12,34,67,88,45};
        System.out.println("Original Array: " + Arrays.toString(arr1));
        for(int i=0; i< arr1.length/2; i++){
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length-i-1];
            arr1[arr1.length-i-1] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr1));

    }
}
