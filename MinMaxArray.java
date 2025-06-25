import java.util.Arrays;
public class MinMaxArray {
    static int min;
    static int max;
    public static void min_max(int[] arr){
        max = arr[0];
        min = arr[0];
        int len = arr.length;
        for(int i=0; i<len; i+=2){
            if(i+1>len) {
                if(arr[i] >max) max = arr[i];
                if(arr[i]< min) min = arr[i];
            }
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) max = arr[i];
                if (arr[i + 1] < min) min = arr[i + 1];
            }
            if (arr[i] < arr[i + 1]) {
                if (arr[i] < min) min = arr[i];
                if (arr[i + 1] > max) max = arr[i + 1];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {14,56,99,34,16,22,56,1,55,6,667,948};
        min_max(arr);
        System.out.println("original array: " + Arrays.toString(arr));
        System.out.println("min value: " +min);
        System.out.println("max value: " +max);
    }
}
