public class subArray {    
    public static void printSubArrays(int numbers[]){
        int totalSubArrays = (numbers.length * (numbers.length + 1)) / 2;
        for(int i =0; i<numbers.length; i++){
            int start = i;
            for(int j =i; j< numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays: " + totalSubArrays);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10}; //arguments passed to the main method
        printSubArrays(numbers);
    }
}
