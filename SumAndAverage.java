import java.util.Scanner;

public class SumAndAverage {
    public static int sumAndAverage(int[] arr){
        Scanner sc = new Scanner(System.in);
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        System.out.println("Sum: " +sum);
        int average = sum/arr.length;

        System.out.println("Average: " +average);
        sc.close();
        return average;

    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        sumAndAverage(arr);
    }
}
