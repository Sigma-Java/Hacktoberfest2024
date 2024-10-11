public class Main {
    public static void main(String[] args) {
        int n = 13; // input number
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        String result = isPrime ? "Prime" : "Not Prime";
        System.out.println("The number " + n + " is: " + result);
    }
}
