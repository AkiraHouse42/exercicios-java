import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite o numero: ");
        a = sc.nextInt();
        System.out.println("Digite o numero: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}