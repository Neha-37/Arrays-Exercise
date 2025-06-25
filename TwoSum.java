import java.util.Arrays;

public class TwoSum {
    public static int[] findPair(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{arr[left], arr[right]};
            } else if (sum<target) {
                left++;
            }else{
                right--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = findPair(arr,target);
        if(result!=null){
            System.out.println("pair found: [" + result[0] + ", " + result[1] + "]");
        }else{
            System.out.println("no pair found");
        }
    }
}
