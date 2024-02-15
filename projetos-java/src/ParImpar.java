import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.println("Digite um numero: ");
        n1 = sc.nextInt();

        if (n1%2 == 0) {
            System.out.println(n1 + " é um numero par");
        } else {
            System.out.println(n1 + " é um numero impar");
        }

        sc.close();
    }
}