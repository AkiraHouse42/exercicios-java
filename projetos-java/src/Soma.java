import java.util.Scanner;

public class Soma {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o primeiro valor: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            int n2 = sc.nextInt();

            int n3 = n1 + n2;

            System.out.println("Soma: " + n3);

            if (n3 > 15) {
                System.out.println("Encerrando o programa...");
                break;
            }
        }

        sc.close();
    }
}