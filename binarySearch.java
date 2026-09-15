public class binarySearch {
    public static int binSearch (int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start <=end){
            int mid = (start + end) / 2;

            //comparisions
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                //right
                start = mid +1;
            }
            else{
                //left
                end = mid-1;
            }
        }
        return -1;  //here return -1 means key is not found in the array cause -1 doesnot exists in the array 
    }
    public static void main(    String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12};
        int key = 1;
        System.out.println("Key found at index: " + binSearch(numbers, key));
    }
}
