import java.util.Arrays;

public class RemoveOccurrance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,5};
        int target = 2;
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] result = removeElement(arr, target);
        System.out.println("After removing " + target + ": " + Arrays.toString(result));
    }
    public static int[] removeElement(int[] arr, int target){
        int count = 0;
        for(int nums:arr){
            if(nums!=target){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int nums: arr){
            if(nums != target){
                result[index++] = nums;
            }
        }
        return result;
    }
}
