import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Digite dois numeros para o calculo: ");
        x = sc.nextInt();
        y = sc.nextInt();

        int s = x + y;
        int m = x - y;
        int u = x * y;
        int d = x / y;

        System.out.println("A soma: " + s);
        System.out.println("A subtração: " + m);
        System.out.println("A multiplicação: " + u);
        System.out.println("A divisão: " + d);

        sc.close();
    }
}