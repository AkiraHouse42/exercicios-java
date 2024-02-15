import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char x;

        x = sc.next().charAt(0);
        System.out.println("voçê digitou: " + x);

        sc.close();
    }
}