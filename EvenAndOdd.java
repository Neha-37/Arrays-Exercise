
import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args) {
        int[] arr = new int[6];
        evenOddCount(arr);
    }
    public static int evenOddCount(int[] arr){
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;
            }
        }
        System.out.println("Even count : " + evenCount);
        System.out.println("Odd count: " + oddCount);
        return evenCount;
    }
}
