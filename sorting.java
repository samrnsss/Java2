// import java.util.Arrays;  //inbuilt method to sort the array
// public class sorting {
//     public static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // swap arr[j] and arr[j+1]
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 9, 1, 5, 6};
        
//         Arrays.sort(arr);  //this was used to sort the array using built-in method
//         // Arrays.sort(arr, 0 ,3);   //this was used to sort the array from index 0 to 3 using built-in method
//         bubbleSort(arr);  //this was used to sort the array using bubble sort method
//         printArray(arr);
//     }
// }



import java.util.Arrays;
import java.util.Collections;
public class sorting {
    public static void printArr(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        
        Arrays.sort(arr, 0,4,Collections.reverseOrder()); // Sort in descending order
        printArr(arr);
    }
}