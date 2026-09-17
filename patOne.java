//Number Pattern

//     public static void numPattern(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for(int i =1; i <=n; i++){
//             //increasing pattern
//             for (int j=1; j<=i; j++){
//                 System.out.print(j + " ");
//             }
//             //decresing pattern
//             for(int k=i-1; k>=1; k--){
//                 System.out.print(k + " ");
//             }
//             //for next line 
//         System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         numPattern(args);
//     }
// }
// import java.util.Scanner;
// public class patOne{
//     public static void numPattern(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         //decreasing pattern
//         for (int i = n; i >= 1; i--){
//             for (int j = n; j >= i; j--){
//                 System.out.print(j);
//             }
//             //increasing pattern
//             for (int k = i+1; k <= n; k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         numPattern(args);
//     }
// }


// import java.util.Scanner;
// public class patOne{
//     public static void numPattern(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         //decreasing pattern
//         for (int i = 1; i <= n; i++){
//             for (int j = i; j >= 1; j--){
//                 System.out.print(j);
//             }
//             //increasing pattern
//             for (int k = 2; k <= i; k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         numPattern(args);
//     }
// }



// public class patOne{
//     public static void numPattern(String[] args){
        
//         int arr[][] = new int[5][5];
//         //decreasing pattern
//         for (int i = 0; i <= 4; i++){
//             for (int j = 0; j <= i; j++){
//                 if(j==0 || j==i){
//                     arr[i][j] = 1;
//                 }
//                 else{
//                     arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
//                 }
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         numPattern(args);
//     }
// }
