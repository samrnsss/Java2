public class pairs {

    public static void printPairs(int numbers[]) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];  //2,3,4,5,6
            for(int j =i+1; j< numbers.length; j++){
                    System.out.print("("+ curr + "," + numbers[j]+")");
                    totalPairs++;
                }
                System.out.println();
        }    
        System.out.println("Total Pairs: " + totalPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {97, 98, 99, 100, 101};
        printPairs(numbers);
        
    }
}
