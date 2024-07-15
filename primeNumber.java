
import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {
        int n, count = 0;
        System.out.print("enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 2) {
                System.out.println(n + "prime number");
            } else {
                System.out.println(n + "not a prime number");
            }

        }

    }

}
