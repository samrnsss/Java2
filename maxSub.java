//brute force approach

// public class maxSub {
//     public static void maxSubarrays(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for (int k = start; k <= end; k++) {
//                     currSum += numbers[k];
//                 }
//                 System.out.println("Current Sum: " + currSum);
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Maximum Sum: " + maxSum);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarrays(numbers);
//     }
// }




//prefix sum approach
// public class maxSub {
//     public static void maxSubarrays(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         //calculate prefix sum
//         for(int i=1; i<prefix.length; i++){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }

//         for (int i =0; i<numbers.length; i++){
//             int start =i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;

//                 //calculate current sum
//                 //if start is 0 then currSum = prefix[end] else currSum = prefix[end] - prefix[start-1]
//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Maximum Sum: " + maxSum);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarrays(numbers);
//     }
// }

//kadane's algorithm
//if all the numbers are negative then the maximum sum will be 0 but if we want to consider the maximum sum of negative numbers then we can initialize maxSum with Integer.MIN_VALUE and currSum with 0.

public class maxSub{
    public static void maxSubarrays(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<numbers.length; i++){
            currSum += numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum Sum: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubarrays(numbers);
    }
}