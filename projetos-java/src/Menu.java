import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int pedido;

        System.out.println("Escolha uma fruta:");
        System.out.println("1. Maçã");
        System.out.println("2. Banana");
        System.out.println("3. Laranja");
        System.out.println("4. Morango");
        System.out.println("5. Abacaxi");
        System.out.println("Digite o número correspondente: ");
        pedido = sc.nextInt();

        switch (pedido) {
            case 1:
                System.out.println("Voçê escolheu maça");
                break;
            case 2:
                System.out.println("Voçê escolheu banana");
                break;
            case 3:
                System.out.println("Voçê escolheu laranja");
                break;
            case 4:
                System.out.println("Voçê escolheu morango");
                break;
            case 5:
                System.out.println("Voçê escolheu abacaxi");
                break;
            default:
                System.out.println("Não existe esse pedido, escolha outro");
        }

        sc.close();
    }
}