public class continuee {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip even numbers
            }
            System.out.println(i); // Print odd numbers
        }
    }
}