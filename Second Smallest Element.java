import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x < smallest) {
                second = smallest;
                smallest = x;
            } else if (x > smallest && x < second) {
                second = x;
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(second);
        }
    }
}