import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world");
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        System.out.println("The Input Provided is: " + userInput);
    }
}