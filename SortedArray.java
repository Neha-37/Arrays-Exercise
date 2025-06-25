import java.util.Scanner;
public class SortedArray {
    public static boolean sortArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        boolean isSorted = sortArray(arr);
        System.out.println(isSorted);
    }
}
