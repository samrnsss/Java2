// public class continuee {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {
//             if (i == 3) {
//                 continue; // Skip even numbers
//             }
//             System.out.println(i); // Print odd numbers
//         }
//     }
// }

//check if a number is prime or not 
// import java.util.Scanner;
// public class continuee {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean isPrime = true;

//             for (int i = 2; i <= n-1; i++) {
//                 if (n % i == 0) {
//                     isPrime = false; // Found a divisor, not prime
//                 }
//             }

//         if (isPrime  == true) {
//             System.out.println(n + " is a prime number.");
//         } else {
//             System.out.println(n + " is not a prime number.");
//         }
//     }
// }