import java.util.Scanner;
public class two {
    //also we can write a function to search for a particular element in the matrix
    public static boolean  search(int matrix[][],int key){
        for(int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Element found at: ("+i+" , "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = new int [3][3];
        //this is used to get the length of the matrix
        int n = matrix.length, m= matrix[0].length; 

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //input the values of the matrix
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //print the values of the matrix
                System.out.print(matrix[i][j]+" ");
            }
            //mandatory  cause it will print the next row in the next line
            System.out.println();
        }
        search(matrix, 5);
}
}
