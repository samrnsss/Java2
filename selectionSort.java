public class selectionSort{
    public static void printArray(int arr[]){
        for(int i =0; i<=arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void selSort(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            int minPos =i;
            for(int j=i+1; j<arr.length; j++){
            if(arr[minPos]> arr[j]){ //here if we use < then it will sort in
            //descending order or we will get reverse array
                minPos = j;
            }
        }
        //swap
        int temp =arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selSort(arr);
        printArray(arr);
    }
}