
import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        int m, n, rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print");
        rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

