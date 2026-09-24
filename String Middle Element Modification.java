import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        if (n % 2 == 1) {
            // Odd length: replace the middle character
            int mid = n / 2;
            s = s.substring(0, mid) + "*" + s.substring(mid + 1);
        } else {
            // Even length: replace the two middle characters
            int mid = n / 2;
            s = s.substring(0, mid - 1) + "**" + s.substring(mid + 1);
        }

        System.out.println(s);

        sc.close();
    }
}
