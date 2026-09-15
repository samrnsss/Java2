public class binToDec {
    public static void binaryToDecimal(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            //math.pow changes the base to a double, so we need to cast it back to an int
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));  //here typecasting is done to convert the result of Math.pow to an integer
            pow++;
            binNum = binNum / 10;
            }

            System.out.println("decimal of " + myNum + " is " + decNum);
    }
        
    public static void main(String[] args) {
        binaryToDecimal(111);
    }
}

