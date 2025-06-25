
public class ArraySum {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {20,40,60,80,40};
        int[] sumArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }
        System.out.print("Sum Array: [");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i]);
            if(i< sumArray.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}