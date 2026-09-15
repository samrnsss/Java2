public class decToBin {
    public static void decimalToBinary(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int remainder = decNum % 2;
            binNum = binNum + (remainder * (int)Math.pow(10, pow));  //here typecasting is done to convert the result of Math.pow to an integer
            pow++;
            decNum = decNum / 2;
            }

            System.out.println("binary of " + myNum + " is " + binNum);
    }
    public static void main(String[] args) {
        decimalToBinary(11);
    }
}
