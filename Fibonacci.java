public class Fibonacci {
    public static void main(String[] args) {
        int terms = 10;
        
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
