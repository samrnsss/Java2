// public class bitwise {
//     public static void main(String [] args){
//         System.out.println(5<<2); //left shift
//         System.out.println(5>>2); //right shift
//     }
// }


//upate ith bit of a number n to b (0 or 1)
// public class bitwise {
//     public static int updateIthBit(int n, int i, int newBit){
//         //clear the ith bit
        
//         n = clearIthBit(n, i);
//         //set the ith bit
//         int BitMask = newBit<<i;
//         return n | BitMask;
//     }
//     public static int clearIthBit(int n, int i){
//         int BitMask = ~(1<<i);
//         return n & BitMask;
//     }
//     public static void main(String [] args){
//         System.out.println(updateIthBit(5, 1, 1));
//     }
// }


// //clear last i bits

// public class bitwise {
//     public static int clearLastIBits(int n, int i){
//         int BitMask = (~0)<<i;
//         return n & BitMask;
//     }
//     public static void main(String [] args){
//         System.out.println(clearLastIBits(15, 2));
//     }
// }



//clear range of bits from i to j
//n=100111010011 , i=2, j=7
// public class bitwise {
//     public static int clearRangeOfBits(int n, int i, int j){
//         // Create a mask with 1s from position i to j
//         int BitMask = (~0) - ((1<<j) - 1);
//         return n & BitMask;
//     }
//     public static int clearBitsinRange(int n, int i, int j){
//         int a = ((~0) << (j + 1)); // 1s before position j
//         int b = (1 << i) - 1; // 1s after position
//         int BitMask = a | b; // 1s before j and after i
//         return n & BitMask;
//     }
//     public static void main(String [] args){
//         System.out.println(clearBitsinRange(10, 2, 4));
//     }
// }


//check if the number is a power of 2 or not

// public class bitwise {
//     public static boolean isPowerOfTwo(int n){
//         return (n & (n-1)) == 0;
//     }
//     public static void main(String [] args){
//         System.out.println(isPowerOfTwo(15));
//         System.out.println(isPowerOfTwo(16));
//     }
// }


//count set bits in a num

// public class bitwise {
//     public static int countSetBits(int n){
//         int count = 0;
//         while(n>0){
//             if((n & 1) == 1){
//                 count++;
//             }
//             n = n>>1;
//         }
//         return count;
//     }
//     public static void main(String [] args){
//         System.out.println(countSetBits(15));
//     }
// }


//fast exponentiation
//a^n = a^(n/2) * a^(n/2) if n is even

// public class bitwise {
//     public static int fastExponentiation(int a, int n){
//         int ans = 1;
//         while(n>0){
//             if((n & 1) != 0){ //check LSB of n, if it is 1 then multiply ans with a
//                 ans = ans * a;
//             }
//             a = a * a;
//             n = n>>1; // right shift n by 1 (equivalent to n = n/2)
//         }
//         return ans;
//     }
//     public static void main(String [] args){
//         System.out.println(fastExponentiation(2, 10));
//     }
// }


//modular exponentiation
// public class bitwise {
//     public static int modularExponentiation(int a, int n, int m){
//         int ans = 1;
//         while(n>0){
//             if((n & 1) != 0){ //check LSB of n, if it is 1 then multiply ans with a
//                 ans = (ans * a) % m;
//             }
//             a = (a * a) % m;
//             n = n>>1; // right shift n by 1 (equivalent to n = n/2)
//         }
//         return ans;
//     }
//     public static void main(String [] args){
//         System.out.println(modularExponentiation(2, 10, 1000));
//     }
// }