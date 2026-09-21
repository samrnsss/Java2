public class insertionSort{
    public static void insertSort(int arr[]){
        for(int i=1; i < arr.length; i++){
            int currentElement =arr[i];
            int previousElement = i-1;

            //finding the correct position to insert the current element
            while(previousElement >=0 && arr[previousElement]> currentElement){
                arr[previousElement+1] = arr[previousElement];
                previousElement--;
            }
            //insertion
            arr[previousElement+1] = currentElement;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={3,4,2,6,5};
        insertSort(arr);
        printArr(arr);
    }
}