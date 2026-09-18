public class arrayLen{
    public static void main(int[] arr , int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;

        int [] arr = {10, 20, 30, 40};
    
        int n = arr.length;
        System.out.println("Length of the array: " + arr.length);
        main(arr, n);
    }
}