public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        int sqrt = (int) Math.sqrt(product);
        if (sqrt * sqrt == product) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}