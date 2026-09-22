public class spiralMatrix {
    public static void printSpiral(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            } 
            // Print right column
            for (int i = top+1; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            if (top <= bottom) {
                // Print bottom row
                for (int i = right-1; i >= left; i--) {
                    if (top == bottom) {
                        return; // Avoid printing the same row twice
                    }
                    System.out.print(matrix[bottom][i] + " ");
                }
                
            }
            if (left <= right) {
                // Print left column
                for (int i = bottom-1; i >= top+1; i--) {
                    if (left == right) {
                        return; // Avoid printing the same column twice
                    }
                    System.out.print(matrix[i][left] + " ");
                }
            }
            top++;
            left++;
            right--;
            bottom--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10},
                {10, 11, 12, 13}
        };
        printSpiral(matrix);
    }
}
    

