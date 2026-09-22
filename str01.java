// public class str01 {
//     public static boolean isPalindrome(String str){
//         for (int i = 0; i < str.length()/2; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String []args){
//         String str = "aashna";
//         System.out.println(isPalindrome(str));

//     }
// }


//question 2: given a route containing 4 directions (N, S, E, W), find the shortest path to reach the destination.
// public class str01{
//     public static float  getShortestPath(String path){
//         int x = 0;
//         int y = 0;
        
//         for(int i=0; i<path.length(); i++){
//             char dir = path.charAt(i);
//         //south
//         if(dir == 's'){
//             y--;
//         }
//         //north
//         if(dir == 'n'){
//             y++;
//         }
//         //east
//         if(dir == 'e'){
//             x++;
//         }
//         //west
//         if(dir == 'w'){
//             x--;
//         }
//     }
//     int x2 =x*x;;
//     int y2 =y*y;
//     return (float) Math.sqrt(x2+y2);
// }
//     public static void main(String [] args){
//         String path = "wneenesennn";
//         System.out.println(getShortestPath(path));
//     }

// }
